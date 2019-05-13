package com.caniksea.service.people.Impl;

import com.caniksea.domain.admin.Course;
import com.caniksea.domain.people.Student;
import com.caniksea.repository.people.StudentRepository;
import com.caniksea.service.people.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentServiceImpl  implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(Student student) {
        return repository.create(student);
    }

    @Override
    public Student update(Student student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Student read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Student> getAll() {
        return repository.getAll();
    }
}
