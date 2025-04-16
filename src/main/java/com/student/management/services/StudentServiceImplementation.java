package com.student.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entities.Student;
import com.student.management.repository.StudentRepository;


@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    StudentRepository repo;

    @Override
    public String addStudent(Student st) {
        repo.save(st); 
        return "Student added from service";
    }
    public Student searchStudent(int roll) {
    	return repo.findById(roll).get();
    }
    public String updateStudent(Student st) {
    	repo.save(st);
    	return "Student updated from service";
    }
    public String deleteStudent(int roll) {
    	repo.deleteById(roll);
    	return "Student deleted from service";
    }
    public List<Student> fetchAllStudents(){
    	return repo.findAll();
    }
    public String deleteAllStudents() {
    	repo.deleteAll();
    	return "Deleted all";
    }
}
