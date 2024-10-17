package com.pavan.rest.service;

import java.util.List;

import com.pavan.rest.entity.Student;

public interface StudentServiceInterface {

	List<Student> getAllStudents();

	Student getStudentInfo(int id);

	Student addStudentDetails(Student student);

	Student modifyStudentDetails(int id);

	Student deleteStudentDetails(int id);

}
