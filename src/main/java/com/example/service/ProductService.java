package com.example.service;

import com.example.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAllProducts();

    public Product getProduct(long id);

    public void createProduct(Product product);

    public Product updateProduct(Product product);

    public void deleteProduct(long id);
}
