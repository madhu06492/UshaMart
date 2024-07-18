package com.example.controller;

import com.example.Response;
import com.example.model.Address;
import com.example.model.Order;
import com.example.service.AddressService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    public Response<List<Address>> getOrders() {
        List<Address> list=addressService.getAddresses();
        if(list.size()<=0){
            return new Response(404,"List of Address is empty",list);
        }

        return new Response(200,"Success",list);

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
