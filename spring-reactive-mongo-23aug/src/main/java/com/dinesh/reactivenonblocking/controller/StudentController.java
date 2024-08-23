package com.dinesh.reactivenonblocking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.reactivenonblocking.model.Student;
import com.dinesh.reactivenonblocking.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {

	@Autowired
	public StudentService studentService;
	
	@GetMapping(value="/students" , produces= MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Student> getAllStudent(){
		
		return studentService.getAllStudent();
	}
	
	@GetMapping("/students/{id}")
	 public Mono<Student> getStudentById(@PathVariable String id){
	 
	 return studentService.getStudentById(id);
	}
	
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		// studentService.addStudent(student);
	}
}
