package com.ido.dbmigration.controller;

import com.ido.dbmigration.domain.Course;
import com.ido.dbmigration.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/course")
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    @PostMapping("/course")
    public void saveCourse(@RequestBody Course course) {
        courseRepository.save(course);
    }

    @DeleteMapping("/course/{id}")
    public void saveCourse(@RequestParam Integer id) {
        Optional<Course> course = courseRepository.findById(id);
        course.ifPresent(s -> courseRepository.delete(s));
    }
}
