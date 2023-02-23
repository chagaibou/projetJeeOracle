package com.projetOracleJee.restaurant.controller;

import com.projetOracleJee.restaurant.entity.Menu;
import com.projetOracleJee.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping(path = "/menu")
    public Menu saveMenu(@RequestBody Menu menu){
        return  menuService.saveMenu(menu);
    }

    @GetMapping("/menu")
    public List<Menu> getMenu(){
        return menuService.getMenu();
    }
}
