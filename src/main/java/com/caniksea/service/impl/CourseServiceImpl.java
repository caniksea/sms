package com.caniksea.service.impl;

import com.caniksea.domain.Course;
import com.caniksea.repository.CourseRepository;
import com.caniksea.repository.impl.CourseRepositoryImpl;
import com.caniksea.service.CourseService;

import java.util.Set;

public class CourseServiceImpl implements CourseService {

    private CourseServiceImpl service = null;
    private CourseRepository repository;

    private CourseServiceImpl(){
        this.repository = CourseRepositoryImpl.getRepository();
    }

    public CourseService getService(){
        if (service == null) service = new CourseServiceImpl();
        return service;
    }


    @Override
    public Course create(Course course) {
        return this.repository.create(course);
    }

    @Override
    public Course update(Course course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Course read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Course> getAllAppDevCourses() {
        Set<Course> courses = getAll();

        return null;
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
    }
}
