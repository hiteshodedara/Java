package com.java.hitesh.demoproject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getstudent(){
        return List.of(new Student(
                1,
                "hitesh",
                "hitesh@gmail.com",
                21,
                LocalDate.of(2003, Month.JULY,29)
        ));
    }
}
