package com.ssm.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ssm.student.bean.LoginForm;
import com.ssm.student.bean.Student;
import com.ssm.student.dao.StudentMapper;
import com.ssm.student.service.StudentService;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    //注入Mapper接口对象
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student login(LoginForm loginForm) {
        return studentMapper.login(loginForm);
    }

    @Override
    public Student fingBySno(Student student) {
        return studentMapper.findBySno(student);
    }

    @Override
    public List<Student> selectList(Student student) {
        return studentMapper.selectList(student);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int updatePassowrd(Student student) {
        return studentMapper.updatePassword(student);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return studentMapper.deleteById(ids);
    }
}
