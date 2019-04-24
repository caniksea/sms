package com.caniksea.repository.impl;

import com.caniksea.domain.Student;
import com.caniksea.repository.StudentRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class StudentRepositoryImplTest {

    private StudentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = StudentRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Student> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}