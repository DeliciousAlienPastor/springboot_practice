package com.example.student.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//this is an example of dependancy injection
//more for semantics; does the same job as declaring it as a bean/component
@Service
public class StudentService {

  private final StudentRepository studentRepository;

  @Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> getStudents() {
    return studentRepository.findAll();
  }
}
