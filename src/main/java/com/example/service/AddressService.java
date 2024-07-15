package com.example.service;

import com.example.model.Address;

import java.util.List;

public interface AddressService {

    public List<Address> getAddresses();

    public Address getAddress(long id);

    public void createAddress(Address address);

    public void updateeAddress(Address address);

    public void deleteAddress(long id);
}
