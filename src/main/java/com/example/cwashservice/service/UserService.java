package com.example.cwashservice.service;

import com.example.cwashservice.entity.User;

public interface UserService {
    void addUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}
