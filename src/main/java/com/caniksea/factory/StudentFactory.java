package com.caniksea.factory;

import com.caniksea.domain.Student;
import com.caniksea.util.Misc;

public class StudentFactory {

    public static Student getStudent(String firstName, String lastName, int age) {
        return new Student.Builder().age(age)
                .studentFirstName(firstName)
                .studentLastName(lastName)
                .studentId(Misc.generateId())
                .build();
    }
}
