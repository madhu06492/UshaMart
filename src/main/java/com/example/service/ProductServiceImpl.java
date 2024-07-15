package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void createProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void deleteProduct(long id) {
        Product delete = productRepo.findById(id).get();
        productRepo.delete(delete);
    }
}

