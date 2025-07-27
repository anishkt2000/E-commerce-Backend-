package com.ecommerce.ecomerce_app.controller;

import com.ecommerce.ecomerce_app.model.Category;
import com.ecommerce.ecomerce_app.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.createCategory(category));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Category category) {
        return ResponseEntity.ok(categoryService.updateCategory(id, category));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.ok("Deleted successfully");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Category>> list() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/get/{slug}")
    public ResponseEntity<Category> getBySlug(@PathVariable String slug) {
        return ResponseEntity.ok(categoryService.getCategoryBySlug(slug));
    }
}
