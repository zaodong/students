package com.ssm.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ssm.student.bean.Grade;
import com.ssm.student.dao.GradeMapper;
import com.ssm.student.service.GradeService;

import java.util.List;
@Service
@Transactional
public class GradeServiceImpl implements GradeService {

    //注入Mapper接口对象
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> selectList(Grade gradename) {
        return gradeMapper.selectList(gradename);
    }

    @Override
    public List<Grade> selectAll() {
        return gradeMapper.selectAll();
    }

    @Override
    public Grade findByName(String gradename) {
        return gradeMapper.findByName(gradename);
    }

    @Override
    public int insert(Grade grade) {
        return gradeMapper.insert(grade);
    }

    @Override
    public int update(Grade grade) {
        return gradeMapper.update(grade);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return gradeMapper.deleteById(ids);
    }
}