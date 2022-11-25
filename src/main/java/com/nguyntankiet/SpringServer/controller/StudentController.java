package com.nguyntankiet.SpringServer.controller;

import com.nguyntankiet.SpringServer.model.student.Student;
import com.nguyntankiet.SpringServer.model.student.StudentDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  @Autowired
  private StudentDao StudentDao;

  @GetMapping("/student/get-all")
  public List<Student> getAllStudents() {
    return StudentDao.getAllStudent();
  }

  @PostMapping("/student/save")
  public Student save(@RequestBody Student student) {
    return StudentDao.save(student);
  }
}
