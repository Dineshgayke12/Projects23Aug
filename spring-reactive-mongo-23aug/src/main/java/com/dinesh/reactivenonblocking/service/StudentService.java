package com.dinesh.reactivenonblocking.service;

import org.springframework.stereotype.Service;

import com.dinesh.reactivenonblocking.Repository.StudentRepository;
import com.dinesh.reactivenonblocking.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

	private StudentRepository studentRepository;
	
	public Flux<Student> getAllStudent(){
		
		return studentRepository.findAll();
	}
	
	public Mono<Student> getStudentById(String id){
		
		return studentRepository.findById(id);
	}

	
	
	
}
