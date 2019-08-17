package com.ssm.student.service;

import org.springframework.stereotype.Service;
import com.ssm.student.bean.Grade;

import java.util.List;
public interface GradeService {

    // 根据年级名称查询指定/全部年级列表信息
    List<Grade> selectList(Grade gradename);

    //  查询所有年级列表信息(用于在班级管理页面中获取年级信息)
    List<Grade> selectAll();

    //  根据年级名称查询指定年级信息
    Grade findByName(String gradename);

    // T添加年级信息
    int insert(Grade grade);

    //  根据id修改指定年级信息
    int update(Grade grade);

    //  根据id删除指定年级信息
    int deleteById(Integer[] ids);
}
