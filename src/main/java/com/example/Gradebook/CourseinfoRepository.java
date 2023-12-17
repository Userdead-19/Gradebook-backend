package com.example.Gradebook;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Gradebook.model.Courseinfo;

public interface CourseinfoRepository extends MongoRepository<Courseinfo, String> {

}