package com.example.classexample.controllers;

import com.example.classexample.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class UserControllerTest {

    @MockBean
    private UserRepository userRepository;

    // test methods
}
