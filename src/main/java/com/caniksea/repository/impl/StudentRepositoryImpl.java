package com.caniksea.repository.impl;

import com.caniksea.domain.Student;
import com.caniksea.repository.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository = null;
    private Set<Student> students;

    private StudentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static StudentRepository getRepository(){
        if(repository == null) repository = new StudentRepositoryImpl();
        return repository;
    }

    public Student create(Student student){
        this.students.add(student);
        return student;
    }

    public Student read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Student update(Student student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Student> getAll(){
        return this.students;
    }
}
