package com.caniksea.service.admin.impl;

import com.caniksea.domain.admin.Course;
import com.caniksea.factory.admin.CourseFactory;
import com.caniksea.repository.admin.CourseRepository;
import com.caniksea.repository.admin.impl.CourseRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.sql.SQLOutput;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseServiceImplTest {

    private CourseRepositoryImpl repository;
    private Course course;

    private Course getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = CourseRepositoryImpl.getRepository();
        this.course = CourseFactory.buildCourse("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Course created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void c_update() {
        String newCourseName = "Application Development Theory 3";
        Course updated = new Course.Builder().copy(getSaved()).courseName(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getCourseName());
    }

    @Test
    public void e_delete() {
        Course saved = getSaved();
        this.repository.delete(saved.getCourseId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Course saved = getSaved();
        Course read = this.repository.read(saved.getCourseId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Course> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}