package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.entity.Item;
import com.projetOracleJee.restaurant.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;


    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getItems() {
        return itemRepository.findAll();
    }
}
