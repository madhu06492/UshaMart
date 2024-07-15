package com.example.service;

import com.example.model.OrderProduct;
import com.example.repository.OrderProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductServiceImpl implements OrderProductService {
    @Autowired
    private OrderProductRepo OrderProductRepo;

    @Override
    public void CreateOrderProduct(OrderProduct orderProduct) {
        OrderProductRepo.save(orderProduct);
    }

    @Override
    public List<OrderProduct> getOrderProducts() {
        return OrderProductRepo.findAll();
    }

    @Override
    public OrderProduct getOrderProduct(long id) {
        return OrderProductRepo.findById(id).get();
    }

    @Override
    public OrderProduct updateOrderProduct(OrderProduct orderProduct) {
        return OrderProductRepo.save(orderProduct);
    }

    @Override
    public void deleteOrderProduct(long id) {
        OrderProductRepo.delete(OrderProductRepo.findById(id).get());
    }
}
