package com.student.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	@GetMapping("/openAddStudentPage")
	public String openAddStudentPage() {
		return "addStudent.html";
	}
	@GetMapping("/updateStudentPage")
	public String updateStudentPage() {
		return "updateStudent.html";
	}
    @GetMapping("/deleteStudentPage")
    public String deleteStudentPage() {
    	return "deleteStudent.html";
    }
    @GetMapping("/searchStudentPage")
    public String searchStudentPage() {
    	return "searchStudent.html";
    }
}
