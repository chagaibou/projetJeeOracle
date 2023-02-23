package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.entity.Menu;
import com.projetOracleJee.restaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu getMenuById(Long menuId) {
        return menuRepository.findByMenuId(menuId);
    }


    public Menu updateMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public List<Menu> getMenu() {
        return menuRepository.findAll();
    }


}
