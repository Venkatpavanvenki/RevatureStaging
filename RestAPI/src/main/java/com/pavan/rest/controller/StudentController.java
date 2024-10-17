package com.pavan.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.pavan.rest.entity.Student;
import com.pavan.rest.service.StudentServiceInterface;

@RestController
public class StudentController {
	
	
	
	@Autowired
	StudentServiceInterface ss;
	
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		List<Student> students = ss.getAllStudents();
		
		return students;
	}

	
	@GetMapping("/student/{id}")
	public Student getStudentInfo(@PathVariable int id)
	{
		
		Student student = ss.getStudentInfo(id);
		return student;
		
	}
	
	@PostMapping("/student/add")
	public void addStudentDetails(@RequestBody Student student)
	{
		Student student1 = ss.addStudentDetails(student);
		
		
	}
	
	@PutMapping("/student/update/{id}")
	public Student modifyStudentDetails(@PathVariable int id)
	{
		Student student = ss.modifyStudentDetails(id);
		return student;
		
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void deleteStudentDetails(@PathVariable int id)
	{
		Student student = ss.deleteStudentDetails(id);
	}
}
