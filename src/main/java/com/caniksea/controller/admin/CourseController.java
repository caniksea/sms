package com.caniksea.controller.admin;

import com.caniksea.domain.admin.Course;
import com.caniksea.factory.admin.CourseFactory;
import com.caniksea.service.admin.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/sms/course")
public class CourseController {

    @Autowired
    private CourseServiceImpl service;

    @GetMapping("/create/{courseName}")
    public @ResponseBody
    Course create(@PathVariable  String courseName){
        Course course = CourseFactory.buildCourse(courseName);
        return service.create(course);

    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Course> getAll(){
        return service.getAll();
    }
}
