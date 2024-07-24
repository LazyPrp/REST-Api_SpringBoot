package com.rest.springboot.dao;

import com.rest.springboot.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  StudentDetailsDAO extends JpaRepository<Student,Integer> {
}
