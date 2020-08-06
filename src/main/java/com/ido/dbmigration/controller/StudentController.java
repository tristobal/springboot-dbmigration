package com.ido.dbmigration.controller;

import com.ido.dbmigration.domain.Student;
import com.ido.dbmigration.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("/student/{id}")
    public void saveStudent(@RequestParam Integer id) {
        Optional<Student> student = studentRepository.findById(id);
        student.ifPresent(s -> studentRepository.delete(s));
    }
}
