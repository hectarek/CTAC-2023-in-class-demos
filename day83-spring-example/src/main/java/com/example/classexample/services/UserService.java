package com.example.classexample.services;

import com.example.classexample.models.User;
import com.example.classexample.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    // add more methods as necessary
}

