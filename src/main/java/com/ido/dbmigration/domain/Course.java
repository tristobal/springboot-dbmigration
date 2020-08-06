package com.ido.dbmigration.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Table(schema = "school", name = "course")
public class Course {

    @Id
    @NotNull
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public Set<Student> getStudents() {
        return students;
    }

}
