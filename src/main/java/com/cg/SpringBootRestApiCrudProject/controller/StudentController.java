package com.cg.SpringBootRestApiCrudProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.SpringBootRestApiCrudProject.entity.Student;
import com.cg.SpringBootRestApiCrudProject.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	// 1. get all the student
		@GetMapping("/students")
		public List<Student> getAll()
		{
			return service.getAllStudent();
		}

		// 2. getStudentById
		@GetMapping("/student/{id}")
		public Student getById(@PathVariable int id) 
		{
			return service.getStudentById(id);
		}
		
		//3. create Student
		@PostMapping("/add")
		@ResponseStatus(code=HttpStatus.CREATED)
		public void createStudent(@RequestBody Student Student)
		{
			service.saveStudent(Student);
		}
		
		//4.delete Student
		@DeleteMapping("/delete/{id}")
		public String deleteStudent(@PathVariable int id)
		{
			return service.deleteStudent(id);
		}
			
		// 5.update Student
		@PutMapping("/update/{id}")
		public Student update(Student student,int id)
		{
			return service.updateStudent(student, id);
		}
		
//		@PutMapping("/update/{id}")
//		public Student update(@RequestBody Student student, @PathVariable int id) {
//		    return service.updateStudent(student, id);
//		}


	}



