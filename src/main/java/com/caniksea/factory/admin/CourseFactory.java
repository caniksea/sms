package com.caniksea.factory.admin;

import com.caniksea.domain.admin.Course;
import com.caniksea.util.Misc;

public class CourseFactory {

    public static Course buildCourse(String courseName) {
        return new Course.Builder().courseId(Misc.generateId())
                .courseName(courseName)
                .build();
    }
}
