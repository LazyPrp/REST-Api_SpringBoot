package com.rest.springboot.service;


import com.rest.springboot.entities.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Value("${student.file.path}")
    private String filePath;

    public List<Student> getAllStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        Path path = Paths.get(filePath);
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] data = line.split(",");
            Student student = new Student();
            student.setId(Long.parseLong(data[0]));
            student.setName(data[1]);
            student.setEmail(data[2]);
            student.setCourse(data[3]);
            students.add(student);
        }
        return students;
    }

    public Student getStudentById(Long id) throws IOException {
        List<Student> students = getAllStudents();
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

    public void saveStudent(Student student) throws IOException {
        List<Student> students = getAllStudents();
        student.setId((long) (students.size() + 1));
        students.add(student);
        saveAllStudents(students);
    }

    public void updateStudent(Student updatedStudent) throws IOException {
        List<Student> students = getAllStudents();
        for (Student student : students) {
            if (student.getId().equals(updatedStudent.getId())) {
                student.setName(updatedStudent.getName());
                student.setEmail(updatedStudent.getEmail());
                student.setCourse(updatedStudent.getCourse());
            }
        }
        saveAllStudents(students);
    }

    public void deleteStudent(Long id) throws IOException {
        List<Student> students = getAllStudents();
        students.removeIf(student -> student.getId().equals(id));
        saveAllStudents(students);
    }

    private void saveAllStudents(List<Student> students) throws IOException {
        List<String> lines = new ArrayList<>();
        for (Student student : students) {
            lines.add(student.getId() + "," + student.getName() + "," + student.getEmail() + "," + student.getCourse());
        }
        Files.write(Paths.get(filePath), lines);
    }
}
