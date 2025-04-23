package com.example.demosimplecicd.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World! From Spring Boot!";
    }

}
