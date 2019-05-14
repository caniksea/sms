package com.caniksea.repository.people.impl;

import com.caniksea.domain.people.Student;
import com.caniksea.repository.people.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemory")
public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository = null;
    private Map<String, Student> students;

    private StudentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static StudentRepository getRepository(){
        if(repository == null) repository = new StudentRepositoryImpl();
        return repository;
    }

    public Student create(Student student){
        this.students.put(student.getStudentId(),student);
        return student;
    }

    public Student read(String studentId){
        return this.students.get(studentId);
    }

    public Student update(Student student) {
        this.students.replace(student.getStudentId(),student);
        return this.students.get(student.getStudentId());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);
    }

    public Set<Student> getAll(){
        Collection<Student> students = this.students.values();
        Set<Student> set = new HashSet<>();
        set.addAll(students);
        return set;
    }
}
