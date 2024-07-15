package com.example.service;

import com.example.model.Order;
import com.example.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> getAllOrders() {
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
