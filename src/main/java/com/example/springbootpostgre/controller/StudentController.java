package com.example.springbootpostgre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootpostgre.repository.StudentRepository;

@RestController
public class StudentController {

    private StudentRepository studentRepository;


    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student/all")
    public ResponseEntity<?> students(){
        return ResponseEntity.ok(studentRepository.findAll());
    }
}
