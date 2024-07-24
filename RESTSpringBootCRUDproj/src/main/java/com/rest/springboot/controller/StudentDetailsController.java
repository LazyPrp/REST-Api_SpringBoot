package com.rest.springboot.controller;

import com.rest.springboot.entities.Student;
import com.rest.springboot.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/students")
public class StudentDetailsController {
    @Autowired
    private StudentDetailsService studentDetailsService;
    @PostMapping(value="/create")//http://localhost:8080/api/students/create
    public Student createStudent(@RequestBody Student student){
        return studentDetailsService.createStudent(student);
    }

    @GetMapping(value = "/student/{studId}")
    public Student getStudentById(@PathVariable("studId") Integer studId){
        return studentDetailsService.getStudentById(studId);
    }

    @GetMapping(value = "/student/allstudents")
    public Iterable<Student> getAllStudentDetails(){
        return studentDetailsService.getAllStudentDetails();
    }

    @DeleteMapping(value = "/student/{studId}")
    public void deleteStudent(@PathVariable("studId") Integer studId){
        studentDetailsService.deleteStudent(studId);
    }

    @PutMapping(value="/student/{studId}/{newName:.+}")//http://localhost:8080/api/students/student/2/Prema Chopra
    public Student updateStudent(@PathVariable("studId")Integer studId,@PathVariable("newName")String newName){
        return studentDetailsService.updateStudent(studId,newName);
    }
    }
