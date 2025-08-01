package com.example.demo.controller;

import com.example.demo.model.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public HelloResponse sayHello() {
        return new HelloResponse("Hello from Java 21 Spring Boot!");
    }
}
