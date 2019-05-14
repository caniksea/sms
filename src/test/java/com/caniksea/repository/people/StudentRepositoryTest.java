package com.caniksea.repository.people;

import com.caniksea.domain.people.Student;
import com.caniksea.factory.people.StudentFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository repository;
    private String studentId=null;

    @Test
    public void StudentCreateTest() throws IOException {
        Student student = StudentFactory.getStudent("John"," Doh",29);
        Student result = repository.create(student);
        studentId= result.getStudentId();
        Assert.assertNotNull(student);


    }

    @Test
    public void SiteStudentTest() throws IOException {
        Student student = repository.read(studentId);
        Assert.assertNotNull(student);


    }


    @Test
    public void GetStudentTest() throws IOException {


    }
    @Test
    public void CreateStudentTest() throws IOException {


    }

}
