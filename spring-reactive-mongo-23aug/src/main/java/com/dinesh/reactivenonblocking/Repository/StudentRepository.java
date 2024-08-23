package com.dinesh.reactivenonblocking.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.dinesh.reactivenonblocking.model.Student;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

}
