package com.pan.service;

import com.pan.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> getAllStudent();
}
