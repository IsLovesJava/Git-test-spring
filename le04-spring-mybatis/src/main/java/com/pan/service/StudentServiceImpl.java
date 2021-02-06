package com.pan.service;

import com.pan.dao.StudentDAO;
import com.pan.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public int addStudent(Student student) {
        return studentDAO.insertStudent();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.selectStudent();
    }
}
