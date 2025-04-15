package com.student.management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entities.Student;
import com.student.management.services.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
     @PostMapping("/addStudent")
     public String addStudent(@RequestBody Student st){
	service.addStudent(st);
	return"Posted from postman";
}

}
