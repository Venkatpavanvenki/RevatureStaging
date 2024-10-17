package com.pavan.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.rest.entity.Student;
import com.pavan.rest.repository.Studentdao;

@Service
public class StudentService implements StudentServiceInterface{

	@Autowired
	Studentdao dao;
	
	public List<Student> getAllStudents() {
		
		
		List<Student> students = dao.findAll();
		return students;
	}

	@Override
	public Student getStudentInfo(int id) {
		Student student = dao.findById(id).get();
		return student;
	}

	@Override
	public Student addStudentDetails(Student student) {
		
		return dao.save(student);
	}

	@Override
	public Student modifyStudentDetails(int id) {
		Student student = dao.findById(id).get();
		student.setName("Venkat");
		student.setPercentage(78);
		student.setBranch("MBA");
		dao.save(student);
		return student;
	}

	@Override
	public Student deleteStudentDetails(int id) {
		Student student = dao.findById(id).get();
		dao.delete(student);
		return student;
	}

}
