package com.spring.SpringREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringREST.entities.Student;
import com.spring.SpringREST.services.StudentService;

@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/home")
	public String home() {
		return "This is the home page";
	}
	
	
	@RequestMapping(value="/marks", method=RequestMethod.GET)
	public List<Student> getMarks(){
		return this.studentService.getMarks();
	}
	
	
	@RequestMapping(value="/mark/{studentId}", method=RequestMethod.GET)
	public Student getMark(@PathVariable String studentId) {
		return this.studentService.getMark(Long.parseLong(studentId));
	}
	
	@RequestMapping(value="/marks", method=RequestMethod.POST)
	public Student addStudent(@RequestBody Student student) {
		
		return this.studentService.addStudent(student);
	}
}
