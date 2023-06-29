package com.example.classexample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/")
    public String home() {
        return "Hello, World!";
    }
}


