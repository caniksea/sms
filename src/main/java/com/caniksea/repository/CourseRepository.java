package com.caniksea.repository;

import com.caniksea.domain.Course;

import java.util.HashSet;
import java.util.Set;

public interface CourseRepository extends IRepository<Course, String> {
    Set<Course> getAll();
}
