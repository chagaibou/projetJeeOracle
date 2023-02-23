package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.entity.Category;
import com.projetOracleJee.restaurant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    public CategoryRepository categoryRepository;
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }


    public Category getCategoryById(Long categoryId) {
        Optional<Category> category = categoryRepository.findByCategoryId(categoryId);
        if (category.isPresent()) {
            return category.get();
        } else {
            return null;
        }
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
