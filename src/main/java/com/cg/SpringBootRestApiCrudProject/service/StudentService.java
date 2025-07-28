package com.cg.SpringBootRestApiCrudProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.SpringBootRestApiCrudProject.entity.Student;
import com.cg.SpringBootRestApiCrudProject.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
	
	public Student saveStudent(Student s)
	{
		return repo.save(s);
	}
	
	
	public List<Student>getAllStudent()
	{
		List<Student>s=repo.findAll();
		return s;
     
	}
	
	public Student getStudentById(int id)
	{
		Student s=repo.findById(id).get();
		return s;
		
	}
	public Student updateStudent(Student s,int id)
	{
		Student student=repo.findById(id).get();
		student.setId(s.getId());
		student.setName(s.getName());
		student.setMob_no(s.getMob_no());
		student.setBranch(s.getBranch());
		return repo.save(student);
	}
	
	public String deleteStudent(int id)
	{
		repo.deleteById(id);
		return "deleted";
	}


	
}
