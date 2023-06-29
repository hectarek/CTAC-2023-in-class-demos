package com.example.day82.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String home() {
        return "This is my website!!";
    }

    @GetMapping("/class")
    public String other() {
        return "Hello Class!!";
    }
}

