package com.ido.dbmigration.repository;

import com.ido.dbmigration.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
