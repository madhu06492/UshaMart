package com.example.service;

import com.example.model.Address;
import com.example.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> getAddresses() {
        return addressRepo.findAll();
    }

    @Override
    public Address getAddress(long id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void createAddress(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void deleteAddress(long id) {
        Address addressDelete = addressRepo.findById(id).get();
        addressRepo.delete(addressDelete);
    }
}
