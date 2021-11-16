package com.spring.SpringREST.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.SpringREST.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	List<Student> list;
	
	public StudentServiceImpl() {
		list = new ArrayList<>();
		list.add(new Student(101, "Venkat", 88));
		list.add(new Student(102, "Ramesh", 90));
		list.add(new Student(103, "Suresh", 60));
		list.add(new Student(104, "Nagesh",50));
	}
	
	@Override
	public List<Student> getDetails() {
		return list;
	}

	@Override
	public Student getDetail(long studentId) {

		Student s=null;
		for(Student student:list) {
			if(student.getId() == studentId)
			{
				s = student;
				break;
			}
		}
		return s;
	}

	@Override
	public Student addStudent(Student student) {
		list.add(student);
		return student;
	}

}
