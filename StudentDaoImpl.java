package com.example.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Student;

public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void insertStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }
}
