package com.ido.dbmigration.domain;

import javax.persistence.*;

@Entity
@Table(schema = "school", name = "course_registration")
public class CourseRegistration {

    @EmbeddedId
    private CourseRegistrationKey id;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @MapsId("course_id")
    @JoinColumn(name = "course_id")
    private Course course;

    private Boolean active;

    public CourseRegistrationKey getId() {
        return id;
    }

    public void setId(CourseRegistrationKey id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
