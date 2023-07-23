package com.example.cwashservice.controller;

import com.example.cwashservice.entity.User;
import com.example.cwashservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public void addUser(User user) {
        this.userService.addUser(user);
    }

    @PutMapping("")
    public void updateUser(Long id, User user) {
        this.userService.updateUser(id, user);
    }
}
