package com.example.student.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  @Query("SELECT s FROM Student s WHERE s.email = ?1") // Student is the class and not the db
  // Optional returns null if the student with the passed email doesnt exist
  Optional<Student> findStudentByEmail(String email);
}
