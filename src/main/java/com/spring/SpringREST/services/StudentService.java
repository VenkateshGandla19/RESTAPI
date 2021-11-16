package com.spring.SpringREST.services;

import java.util.List;

import com.spring.SpringREST.entities.Student;

public interface StudentService {

	public List<Student> getDetails();
	
	public Student getDetail(long studentId);

	public Student addStudent(Student student);
}
