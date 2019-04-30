package com.caniksea.service.admin;

import com.caniksea.domain.admin.Course;
import com.caniksea.service.IService;

import java.util.Set;

public interface CourseService extends IService<Course, String> {
    Set<Course> getAll();
}
