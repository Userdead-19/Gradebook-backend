package com.example.Gradebook;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Gradebook.model.Gradeentry;

public interface GradeentryRepository extends MongoRepository<Gradeentry, String> {
    // You don't need to declare findOne explicitly.
    // It's provided by the MongoRepository interface.
    // Gradeentry findOne(String rollno);
}
