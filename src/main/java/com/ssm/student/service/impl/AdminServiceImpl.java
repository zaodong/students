package com.ssm.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ssm.student.bean.Admin;
import com.ssm.student.bean.LoginForm;
import com.ssm.student.dao.AdminMapper;
import com.ssm.student.service.AdminService;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    //注入Mapper接口对象
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(LoginForm loginForm) { return adminMapper.login(loginForm); }

    @Override
    public List<Admin> selectList(Admin admin) {
        return adminMapper.selectList(admin);
    }

    @Override
    public Admin findByName(String name) {
        return adminMapper.findByName(name);
    }

    @Override
    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }

    @Override
    public int update(Admin admin) { return adminMapper.update(admin); }

    @Override
    public int updatePassowrd(Admin admin) {
        return adminMapper.updatePassword(admin);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return adminMapper.deleteById(ids);
    }

}

