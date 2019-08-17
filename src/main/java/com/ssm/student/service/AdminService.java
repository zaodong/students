package com.ssm.student.service;

import com.ssm.student.bean.Admin;
import com.ssm.student.bean.LoginForm;

import java.util.List;

public interface AdminService {

    //  验证登录信息是否正确
    Admin login(LoginForm loginForm);

    // 根据用户名查询指定管理员信息
    Admin findByName(String name);

    // 添加管理员信息
    int insert(Admin admin);

    // 根据姓名查询指定/所有管理员信息列表
    List<Admin> selectList(Admin admin);

    // 根据id更新指定管理员信息
    int update(Admin admin);

    //  根据id修改指定用户密码
    int updatePassowrd(Admin admin);

    //根据id删除管理员信息
    int deleteById(Integer[] ids);

}