package com.example.cwashservice.service;

import com.example.cwashservice.entity.Address;

public interface AddressService {
    Address getById(Long id);
    void deleteById(Long id);
    void updateAddress(Long id, Address address);
    Address saveAddress(Address address);
}
