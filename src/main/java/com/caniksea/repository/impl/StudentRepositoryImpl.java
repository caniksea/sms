package com.caniksea.repository.impl;

import com.caniksea.domain.Student;
import com.caniksea.repository.StudentRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * An implementation (Singleton) of the interface
 */
public class StudentRepositoryImpl implements StudentRepository {
    private static StudentRepository repository = null;
    private Set<Student> students;

    private StudentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    private Student findStudent(String studentId) {
        return this.students.stream().filter(student -> student.getStudentId().equals(studentId)).findAny().orElse(null);
    }

    public static StudentRepository getRepository(){
        if (repository == null) repository = new StudentRepositoryImpl();
        return repository;
    }

    @Override
    public Student create(Student student) {
        this.students.add(student);
        return student;
    }

    @Override
    public void delete(Student student) {
        this.students.remove(student);
    }

    @Override
    public Student read(final String studentId) {
        return findStudent(studentId);
    }

    @Override
    public Student update(Student student) {
        // find the student to update in the student collection
        // if found, update and save back into the student collection
        return null;
    }

    public Set<Student> getAll() {
        return this.students;
    }
}
