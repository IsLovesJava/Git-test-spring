package com.pan.dao;

import com.pan.domain.Student;

import java.util.List;

public interface StudentDAO {
    int insertStudent();
    List<Student> selectStudent();
}
