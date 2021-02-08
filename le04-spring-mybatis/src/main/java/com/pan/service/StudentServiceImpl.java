package com.pan.service;

import com.pan.dao.StudentDAO;
import com.pan.domain.Student;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    //表示方法需要事务处理
    @Transactional (
            //传播行为
            propagation = Propagation.REQUIRED,//默认值
            //隔离级别
            isolation = Isolation.DEFAULT,//默认值
            //方法内的数据库访问都是只读
            readOnly = false,//默认值
            //发生异常回滚
            rollbackFor = {
                    NullPointerException.class,
                    SQLException.class
            }
    )
    @Override
    public int addStudent(Student student) {
        return studentDAO.insertStudent();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.selectStudent();
    }
}
