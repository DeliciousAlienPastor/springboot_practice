package com.example.student.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//this is an example of dependancy injection
//more for semantics; does the same job as declaring it as a bean/component
@Service
public class StudentService {
  public List<Student> getStudents() {
    return List.of(
        new Student(
            1L,
            "Mary",
            "mary@gmail.com",
            LocalDate.of(1998, Month.MARCH, 30),
            23));
  }
}
