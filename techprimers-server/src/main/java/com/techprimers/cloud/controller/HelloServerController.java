package com.techprimers.cloud.controller;

import com.techprimers.cloud.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloServer")
public class HelloServerController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("GetStudentInfo")
    public Student GetStudentInfo(@RequestParam(name = "name") String name, @RequestParam(name = "Title") String title) {
        Student student = new Student();
        student.setName(name);
        student.setJobTitle(title);
        student.setDescription(String.format("Your job is %s ,Welcome to join Us", student.getJobTitle()));
        return student;
    }
}
