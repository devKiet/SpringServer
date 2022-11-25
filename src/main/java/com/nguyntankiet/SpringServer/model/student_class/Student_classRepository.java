package com.nguyntankiet.SpringServer.model.student_class;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_classRepository extends CrudRepository<Student_class,Integer> {
}
