package com.example.Gradebook;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Gradebook.model.Courseinfo;
import com.example.Gradebook.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student> findById(int id);

    Optional<Courseinfo> findOne(String rollno);

    Object findAll(String rollno);

}
