package com.example.Gradebook;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Gradebook.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
