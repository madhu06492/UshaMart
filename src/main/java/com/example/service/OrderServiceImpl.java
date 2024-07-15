package com.example.service;

import com.example.model.Order;
import com.example.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }

    @Override
    public Order getOrder(long id) {
        return orderRepo.findById(id).get();
    }

    @Override
    public void createOrder(Order order) {
        orderRepo.save(order);
    }

    @Override
    public void updateOrder(Order order) {
        orderRepo.save(order);
    }

    @Override
    public void deleteOrder(long id) {
        Order delete = orderRepo.findById(id).get();
        orderRepo.delete(delete);
    }
}
