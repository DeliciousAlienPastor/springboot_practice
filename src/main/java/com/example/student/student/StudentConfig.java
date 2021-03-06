package com.example.student.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
  @Bean
  // inject access to StudentRepository
  // CommandLineRunner is an interface that invokes the run method when the
  // application starts
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      // notice the id is not included as this will be auto generated
      Student paul = new Student(
          "Paul",
          "paul@gmail.com",
          LocalDate.of(1998, Month.MARCH, 30));

      Student janine = new Student(
          "Janine",
          "janine@gmail.com",
          LocalDate.of(1986, Month.MAY, 25));

      repository.saveAll(List.of(paul, janine));
    };

  };
}
