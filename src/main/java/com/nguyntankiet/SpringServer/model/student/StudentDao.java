package com.nguyntankiet.SpringServer.model.student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class StudentDao {

  @Autowired
  private StudentRepository repository;

  public Student save(Student student) {
    return repository.save(student);
  }

  public List<Student> getAllStudent() {
    List<Student> student = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(student::add);
    return student;
  }

  public void delete(int employeeId) {
    repository.deleteById(employeeId);
  }
}
