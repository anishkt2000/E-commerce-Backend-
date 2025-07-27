package com.ecommerce.ecomerce_app.service.impl;

import com.ecommerce.ecomerce_app.model.Category;
import com.ecommerce.ecomerce_app.repository.CategoryRepository;
import com.ecommerce.ecomerce_app.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        Optional<Category> existing = categoryRepository.findByName(category.getName());
        if(existing.isPresent()){
            return existing.get();
        }
        category.setSlug(category.getName().toLowerCase().replace(" ", "-"));
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(String id, Category category) {
        Category existing =categoryRepository.findById(id).orElseThrow();
        existing.setName(category.getName());
        existing.setSlug(category.getName().toLowerCase().replace(" ", "-"));
        return categoryRepository.save(existing);
    }

    @Override
    public void deleteCategory(String id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryBySlug(String slug) {
        return categoryRepository.findBySlug(slug).orElseThrow();

    }
}
