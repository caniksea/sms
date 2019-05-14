package com.caniksea.controller.people;

import com.caniksea.domain.people.Student;
import com.caniksea.factory.people.StudentFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class StudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetStudentById() {
        Student student = restTemplate.getForObject(baseURL + "/student/1", Student.class);
        System.out.println(student.getStudentFirstName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateStudent() {
        Student student = StudentFactory.getStudent("John"," Doh",29);

        ResponseEntity<Student> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Student.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateStudent() {
        int id = 1;
        Student student = restTemplate.getForObject(baseURL + "/student/" + id, Student.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Student updatedStudent = restTemplate.getForObject(baseURL + "/Student/" + id, Student.class);
        assertNotNull(updatedStudent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Student student = restTemplate.getForObject(baseURL + "/students/" + id, Student.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Student.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

