package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private int id;

    private String name;
    private String city;

    // Getters and Setters
}
