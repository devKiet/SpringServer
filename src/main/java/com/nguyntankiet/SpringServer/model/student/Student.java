package com.nguyntankiet.SpringServer.model.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_student;
  private String name_student;
  private String birthday;
  private String img;
  public int getId_student() {
    return id_student;
  }

  public void setId_student(int id_student) {
    this.id_student = id_student;
  }

  public String getName_student() {
    return name_student;
  }

  public void setName_student(String name_student) {
    this.name_student = name_student;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id_student=" + id_student +
        ", name_student='" + name_student + '\'' +
        ", birthday='" + birthday + '\'' +
        ", img='" + img + '\'' +
        '}';
  }
}
