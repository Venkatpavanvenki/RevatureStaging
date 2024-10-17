package com.pavan.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.rest.entity.Student;

public interface Studentdao extends JpaRepository<Student, Integer> {


}
