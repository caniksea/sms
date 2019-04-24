package com.caniksea.service;

import com.caniksea.domain.Course;

import java.util.Set;

public interface CourseService extends IService<Course, String> {

    Set<Course> getAllAppDevCourses();
    Set<Course> getAll();
}
