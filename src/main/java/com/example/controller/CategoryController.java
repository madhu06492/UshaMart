package com.example.controller;

import com.example.model.Category;
import com.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/category")
    public void createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
    }

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @GetMapping("/category/{CategoryId}")
    public Category getCategory(@PathVariable long CategoryId) {
        return categoryService.getCategory(CategoryId);
    }

    @PutMapping("/category")
    public Category updateCategory(@RequestBody Category category) {
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("category/{categoryId}")
    public void deleteCategory(@PathVariable long categoryId) {
        categoryService.deleteCategory(categoryId);
    }
}
