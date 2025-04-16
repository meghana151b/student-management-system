package com.student.management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entities.Student;
import com.student.management.services.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
     @PostMapping("/addStudent")
     public String addStudent(@ModelAttribute Student st){
	service.addStudent(st);
	return"Added Student from postman";
}
     @GetMapping("/searchStudent")
     public Student searchStudent(@RequestParam int roll) {
    	return service.searchStudent(roll);
     }
     @PostMapping("/updateStudent")
     public String updateStudent(@ModelAttribute Student st) {
    	 service.updateStudent(st);
    	 return "Updated Student";
     }
     @GetMapping("/deleteStudent")
    	 public String deleteStudent(@RequestParam int roll) {
    		 service.deleteStudent(roll);
    		 return "Student deleted successfully";
     }
     @GetMapping("/fetchAllStudents")
     public List<Student> fetchAllStudents(){
    	 return service.fetchAllStudents();
     }
     
     @GetMapping("/deleteAllStudents")
     public String deleteAllStudents() {
    	 service.deleteAllStudents();
    	 return "Deleted all students";
     }

}
