package com.caniksea.domain.people;

import com.caniksea.domain.admin.Course;

import java.util.Objects;
import java.util.Set;

public class Student {

    private String studentId, studentFirstName, studentLastName;
    private int age;
    private Set<Course> courses;

    private Student(){}

    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.age = builder.age;
        this.studentFirstName = builder.studentFirstName;
        this.studentLastName = builder.studentLastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.studentId.compareTo(o.studentId);
//    }

    public static class Builder {

        private String studentId, studentFirstName, studentLastName;
        private int age;
        private Set<Course> courses;

        public Builder studentId( String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder studentFirstName( String studentFirstName) {
            this.studentFirstName = studentFirstName;
            return this;
        }

        public Builder studentLastName( String studentLastName) {
            this.studentLastName = studentLastName;
            return this;
        }

        public Builder age( int age) {
            this.age = age;
            return this;
        }

//        public Builder copy(Student student) {
//            this.studentId = student.studentId;
//            this.studentFirstName = student.studentFirstName;
//            this.studentLastName = student.studentLastName;
//            this.age = student.age;
//
//            return this;
//        }

        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", StudentFirstName='" + studentFirstName + '\'' +
                ", StudentLastName='" + studentLastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
