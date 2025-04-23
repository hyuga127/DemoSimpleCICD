package com.example.demosimplecicd.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/")
    public Map<String, String> index() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to the Spring Boot API!");
        response.put("status", "success");
        return response;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World! From Spring Boot!";
    }
}
