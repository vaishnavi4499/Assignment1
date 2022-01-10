package com.assignment.student.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.student.implementation.Implementation;
import com.assignment.student.model.Student;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	Implementation service;
	
	@GetMapping("")
	public List<Student> getData() {
		return service.getAll();
	}

}
