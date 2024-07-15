package com.example.service;


import com.example.model.OrderProduct;

import java.util.List;

public interface OrderProductService {
    public void CreateOrderProduct(OrderProduct orderProduct);

    public List<OrderProduct> getOrderProducts();

    public OrderProduct getOrderProduct(long id);

    public OrderProduct updateOrderProduct(OrderProduct orderProduct);

    public void deleteOrderProduct(long id);
}
