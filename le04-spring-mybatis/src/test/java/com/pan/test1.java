package com.pan;

import com.pan.domain.Student;
import com.pan.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test1 {
    @Test
    public void test01() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object sessionFactory = app.getBean("sqlSessionFactory");
        System.out.println(sessionFactory);
    }

    @Test
    public void test02() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService sessionFactory = (StudentService)app.getBean("studentService");
        List<Student> allStudent = sessionFactory.getAllStudent();
        for (Student s:allStudent
             ) {
            System.out.println(s);
        }

    }

    @Test
    public void test03() {

    }
}
