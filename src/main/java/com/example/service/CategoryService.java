package com.example.service;

import com.example.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();

    public Category getCategory(long id);

    public void createCategory(Category category);

    public Category updateCategory(Category Category);

    public void deleteCategory(long id);


}
