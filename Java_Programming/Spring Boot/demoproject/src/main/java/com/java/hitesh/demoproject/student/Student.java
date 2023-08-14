package com.java.hitesh.demoproject.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    private long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dba;


    public Student() {
    }

    public Student(long id, String name, String email, int age, LocalDate dba) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dba = dba;
    }

    public Student(String name, String email, int age, LocalDate dba) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dba = dba;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDba() {
        return dba;
    }

    public void setDba(LocalDate dba) {
        this.dba = dba;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dba=" + dba +
                '}';
    }
}
