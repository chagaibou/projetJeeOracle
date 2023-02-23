package com.projetOracleJee.restaurant.controller;

import com.projetOracleJee.restaurant.entity.Category;
import com.projetOracleJee.restaurant.entity.Menu;
import com.projetOracleJee.restaurant.service.CategoryService;
import com.projetOracleJee.restaurant.service.ItemService;
import com.projetOracleJee.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ItemService itemService;
    @Autowired
    private MenuService menuService;

    @PostMapping(path = "/menu/{menuId}/categories")
    public Category saveCategoryWithMenu(@PathVariable("menuId") Long menuId, @RequestBody Category category){
        Menu menu  = menuService.getMenuById(menuId);
        if (menu == null) {
            throw new RuntimeException("Menu not found with ID: " + menuId);
        }
        List<Category> menu_categories = menu.getCategories();
        menu_categories.add(category);
        List<Category> new_categories = menu_categories;
        menu.setCategories(new_categories);
        return categoryService.saveCategory(category);

    }

    @GetMapping("/categories")
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }



}
