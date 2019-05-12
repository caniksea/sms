package com.caniksea.repository.admin;

import com.caniksea.domain.admin.Course;
import com.caniksea.repository.IRepository;

import java.util.Set;

public interface CourseRepository extends IRepository<Course, String> {
    Set<Course> getAll();
}
