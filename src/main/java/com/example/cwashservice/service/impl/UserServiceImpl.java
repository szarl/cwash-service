package com.example.cwashservice.service.impl;
import com.example.cwashservice.entity.User;
import com.example.cwashservice.repository.UserRepository;
import com.example.cwashservice.service.AddressService;
import com.example.cwashservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final AddressService addressService;

    @Autowired
    public UserServiceImpl (UserRepository userRepository, AddressService addressService) {
        this.userRepository = userRepository;
        this.addressService = addressService;
    }

    @Override
    public void addUser(User user) {
        this.userRepository.save(user);
        this.addressService.saveAddress(user.getAddress());
    }

    @Override
    public void updateUser(Long id, User user) {

    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
