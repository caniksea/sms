package com.caniksea.repository;

import com.caniksea.domain.Student;

import java.util.HashSet;
import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student> getAll();

}
