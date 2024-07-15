package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();

    public Product getProduct(long id);

    public void createProduct(Product product);

    public Product updateProduct(Product product);

    public void deleteProduct(long id);
}
