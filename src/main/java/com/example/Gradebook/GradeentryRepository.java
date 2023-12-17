package com.example.Gradebook;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Gradebook.model.Gradeentry;

public interface GradeentryRepository extends MongoRepository<Gradeentry, String> {

    Gradeentry findAll(String rollno);

}
