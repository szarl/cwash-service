package com.example.cwashservice.service.impl;

import com.example.cwashservice.entity.Address;
import com.example.cwashservice.repository.AddressRepository;
import com.example.cwashservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address getById(Long id) {
        return this.addressRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        this.addressRepository.deleteById(id);
    }

    @Override
    public void updateAddress(Long id, Address address) {
        Address oldAddress = this.addressRepository.findById(id).orElse(null);
        if (oldAddress != null) {
            this.addressRepository.delete(oldAddress);
            this.addressRepository.save(address);
        }
    }

    @Override
    public Address saveAddress(Address address) {
        return this.addressRepository.save(address);
    }
}
