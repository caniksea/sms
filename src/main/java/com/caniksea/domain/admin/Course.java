package com.caniksea.domain.admin;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Course {

    private String courseId, courseName;

    private Course(){}

    private Course(Builder builder) {
        this.courseId = builder.courseId;
        this.courseName = builder.courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public static class Builder{

        private String courseId, courseName;

        public Builder courseId(String courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder copy(Course course){
            this.courseId = course.courseId;
            this.courseName = course.courseName;

            return this;
        }

        public Course build() {
            return new Course(this);
        }

    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId.equals(course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
