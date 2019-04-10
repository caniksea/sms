package com.caniksea.factory;

import com.caniksea.domain.Course;
import com.caniksea.util.Misc;

public class CourseFactory {

    public static Course getCourse(String courseName) {
        return new Course.Builder().courseId(Misc.generateId())
                .courseName(courseName)
                .build();
    }
}
