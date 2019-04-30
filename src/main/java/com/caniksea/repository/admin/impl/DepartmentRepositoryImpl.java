package com.caniksea.repository.admin.impl;

import com.caniksea.domain.admin.Department;
import com.caniksea.repository.admin.DepartmentRepository;

import java.util.HashSet;
import java.util.Set;

public class DepartmentRepositoryImpl implements DepartmentRepository {

    private static DepartmentRepository repository = null;
    private Set<Department> departments;

    private DepartmentRepositoryImpl(){
        this.departments = new HashSet<>();
    }

    public static DepartmentRepository getRepository(){
        if (repository == null) repository = new DepartmentRepositoryImpl();
        return repository;
    }

    public Department create(Department department) {
        //insert into the set of departments
        return department;
    }

    public Department read(String departmentId){
        // find the department with the id and return it
        return null;
    }

    public Department update(Department department){
        // find the department that matches this and update it
        return null;
    }

    public void delete(String departmentId) {
        // find the department with id and delete it
    }

    public Set<Department> getAll(){



        return this.departments;
    }
}
