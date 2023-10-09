package com.app.demo.controller;

import com.app.demo.model.User;
import com.app.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")  // give data to front-end
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
