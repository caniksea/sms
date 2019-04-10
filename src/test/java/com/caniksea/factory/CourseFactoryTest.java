package com.caniksea.factory;

import com.caniksea.domain.Course;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseFactoryTest {

    @Test
    public void getCourse() {

        String name = "ADP 3";
        Course c = CourseFactory.getCourse(name);
        System.out.println(c);
        Assert.assertNotNull(c.getCourseId());
    }
}