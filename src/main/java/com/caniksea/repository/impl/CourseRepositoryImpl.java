package com.caniksea.repository.impl;

import com.caniksea.domain.Course;
import com.caniksea.repository.CourseRepository;

import java.util.HashSet;
import java.util.Set;

public class CourseRepositoryImpl implements CourseRepository {

    private static CourseRepositoryImpl repository = null;
    private Set<Course> courses;

    private CourseRepositoryImpl(){
        this.courses = new HashSet<>();
    }

    public static CourseRepositoryImpl getRepository(){
        if (repository == null) repository = new CourseRepositoryImpl();
        return repository;
    }


    public Course create(Course course){
        this.courses.add(course);
        return course;
    }

    public Course read(String courseId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String courseId) {
        // find the course, delete it if it exist
    }

    public Course update(Course course){
        // find the course, update it and delete it if it exists
        return course;
    }


    public Set<Course> getAll(){
        return this.courses;
    }
}
