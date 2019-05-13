package com.caniksea.controller.people;


import com.caniksea.domain.people.Student;
import com.caniksea.service.people.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    @Qualifier("ServiceImpl")
    private StudentService service;

    @PostMapping("/create")
    @ResponseBody
    public Student create(Student student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Student update(Student student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Student read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Student> getAll() {
        return service.getAll();
    }

}
