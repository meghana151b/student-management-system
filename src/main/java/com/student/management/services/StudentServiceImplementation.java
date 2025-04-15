package com.student.management.services;

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
}
