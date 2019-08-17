package com.ssm.student.dao;

import com.ssm.student.bean.Admin;
import com.ssm.student.bean.LoginForm;

import java.util.List;

/**
 * @project: sms
 * @description: 数据访问层-操控管理员信息
 * @website: https://yubuntu0109.github.io/
 */
public interface AdminMapper {

    //
    Admin login(LoginForm loginForm);

    // 通过姓名查询指定管理员信息
    Admin findByName(String name);

    // 添加管理员信息
    int insert(Admin admin);

    // 根据姓名查询指定/所有管理员信息列表
    List<Admin> selectList(Admin admin);

    // 根据id更新指定管理员信息
    int update(Admin admin);

    // 根据id修改指定管理员密码
    int updatePassword(Admin admin);

    // 根据id删除指定管理员信息
    int deleteById(Integer[] ids);

}