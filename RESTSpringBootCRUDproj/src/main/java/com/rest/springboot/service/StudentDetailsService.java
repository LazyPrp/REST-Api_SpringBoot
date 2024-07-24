package com.rest.springboot.service;

import com.rest.springboot.dao.StudentDetailsDAO;
import com.rest.springboot.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDetailsService {
    @Autowired
    private StudentDetailsDAO studentDetailsDAO;
    public Student createStudent(Student student){
        return studentDetailsDAO.save(student);
    }
    public Student getStudentById(Integer studId){

        return studentDetailsDAO.findById(studId).get();
    }
    public Iterable<Student> getAllStudentDetails(){
        return studentDetailsDAO.findAll();
    }
    public void deleteStudent(Integer studId){
        studentDetailsDAO.deleteById(studId);
    }
    public Student updateStudent(Integer studId,String newName){
Student studentFromDb=studentDetailsDAO.findById(studId).get();
studentFromDb.setStudName(newName);
        Student updatedStudent = studentDetailsDAO.save(studentFromDb);
        return updatedStudent;
    }

}
