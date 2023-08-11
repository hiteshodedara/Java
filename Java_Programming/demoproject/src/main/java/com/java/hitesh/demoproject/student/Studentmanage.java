package com.java.hitesh.demoproject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="/index")
public class Studentmanage {
    private final StudentService studentService;

    @Autowired
    public Studentmanage(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getstudent(){
        return studentService.getstudent();
    }
}
