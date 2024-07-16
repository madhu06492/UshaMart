package com.example.controller;

import com.example.model.Address;
import com.example.model.Order;
import com.example.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    public List<Address> getOrders() {
        return this.addressService.getAddresses();
    }

    @GetMapping("/address/{addressId}")
    public Address getOrder(@PathVariable long addressId) {
        return this.addressService.getAddress(addressId);
    }

    @PostMapping("/address")
    public void createOrder(@RequestBody Address address) {
        this.addressService.createAddress(address);
    }

    @PutMapping("/address")
    public void updateOrder(@RequestBody Address address) {
        this.addressService.updateAddress(address);
    }

    @DeleteMapping("/address/{addressId}")
    public void deleteOrder(@PathVariable long addressId) {
        this.addressService.deleteAddress(addressId);
    }


}
