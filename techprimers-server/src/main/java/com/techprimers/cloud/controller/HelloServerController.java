package com.techprimers.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloServer")
public class HelloServerController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
