package com.caniksea.repository.people;

import com.caniksea.domain.people.Student;
import com.caniksea.repository.IRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student> getAll();

}
