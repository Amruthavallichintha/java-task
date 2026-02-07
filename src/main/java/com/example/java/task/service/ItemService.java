package com.example.java.task.service;


import com.example.java.task.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    //in memory storage
    private final List<Item> items = new ArrayList<>();
    //add item
    public Item addItem(Item item) {
        items.add(item);
        return item;
    }
    //get item by id
    public Item getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}


