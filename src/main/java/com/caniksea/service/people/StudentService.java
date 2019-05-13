package com.caniksea.service.people;

import com.caniksea.domain.people.Student;
import com.caniksea.service.IService;

import java.util.Set;

public interface StudentService extends IService<Student,String> {
    Set<Student> getAll();
}
