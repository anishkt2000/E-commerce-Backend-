package com.ecommerce.ecomerce_app.service;

import com.ecommerce.ecomerce_app.model.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);
    Category updateCategory(String id, Category category);
    void deleteCategory(String id);
    List<Category> getAllCategories();
    Category getCategoryBySlug(String slug);

}
