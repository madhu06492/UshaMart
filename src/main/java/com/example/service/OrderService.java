package com.example.service;

import com.example.model.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getOrders();

    public Order getOrder(long id);

    public void createOrder(Order order);

    public void updateOrder(Order order);

    public void deleteOrder(long id);

}
