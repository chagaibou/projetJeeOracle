package com.projetOracleJee.restaurant.controller;

import com.projetOracleJee.restaurant.entity.Category;
import com.projetOracleJee.restaurant.entity.Item;
import com.projetOracleJee.restaurant.service.CategoryService;
import com.projetOracleJee.restaurant.service.ItemService;
import com.projetOracleJee.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ItemController {
    @Autowired
    private ItemService itemService;

    @Autowired
    private CategoryService categoryService;
    @Autowired
    MenuService menuService;


    @PostMapping("/categories/{categoryId}/items")
    public Item addItemToCategory(@PathVariable("categoryId") Long categoryId, @RequestBody Item item) {
        Category category = categoryService.getCategoryById(categoryId);
        if (category == null) {
            throw new RuntimeException("Category not found with ID: " + categoryId);
        }
        List<Item> categories_items = category.getItems();
        categories_items.add(item);
        List<Item> new_items = categories_items;
        category.setItems(new_items);
        return itemService.saveItem(item);
    }

    @GetMapping("/items")
    public List<Item> getItems(){
        return itemService.getItems();
    }

}
