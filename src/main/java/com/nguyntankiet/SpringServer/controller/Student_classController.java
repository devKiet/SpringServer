package com.nguyntankiet.SpringServer.controller;

import com.nguyntankiet.SpringServer.model.student_class.Student_class;
import com.nguyntankiet.SpringServer.model.student_class.Student_classDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Student_classController {
    @Autowired
    private Student_classDao student_classDao;
    @GetMapping("/student_class/get-all")
    public List<Student_class> getAllStudent_class() { return student_classDao.getAllStudent_class();}

    @GetMapping("/student_class/save")
    public Student_class save(Student_class student_class) {return student_classDao.save(student_class);}
}
