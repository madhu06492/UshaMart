package com.example.controller;

import com.example.model.Order;
import com.example.model.Product;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public List<Order> getOrders() {
        return this.orderService.getOrders();
    }

    @GetMapping("/order/{orderId}")
    public Order getOrder(@PathVariable long orderId) {
        return this.orderService.getOrder(orderId);
    }

    @PostMapping("/order")
    public void createOrder(@RequestBody Order order) {
        this.orderService.createOrder(order);
    }

    @PutMapping("/order")
    public void updateOrder(@RequestBody Order order) {
        this.orderService.updateOrder(order);
    }

    @DeleteMapping("/order/{orderId}")
    public void deleteOrder(@PathVariable long orderId) {
        this.orderService.deleteOrder(orderId);
    }


}
