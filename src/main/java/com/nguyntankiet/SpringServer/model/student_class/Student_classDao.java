package com.nguyntankiet.SpringServer.model.student_class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Student_classDao {

    @Autowired
    private Student_classRepository repository;
    public Student_class save(Student_class student_class) { return repository.save(student_class);}

    public List<Student_class> getAllStudent_class() {
        List<Student_class> student_class = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(student_class::add);
        return student_class;
    }
}
