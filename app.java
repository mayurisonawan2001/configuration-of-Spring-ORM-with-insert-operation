package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.StudentDao;
import com.example.entity.Student;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        Student student = new Student();
        student.setId(101);
        student.setName("Radha");
        student.setCity("Pune");

        studentDao.insertStudent(student);
        
        System.out.println("Student inserted successfully.");
    }
}
