package com.caniksea.repository;

import com.caniksea.domain.Student;

public interface StudentRepository {

    Student create(Student student);
    Student update(Student student);
    void delete(Student student);
    Student read(String studentId);
}
