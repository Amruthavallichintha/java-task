package com.example.java.task.controller;



import com.example.java.task.model.Item;
import com.example.java.task.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // Add Item
    @GetMapping("/add")
    public ResponseEntity<Item> addItemUsingGet(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam double price
    ) {
        Item item = new Item(id, name, description, price);
        return ResponseEntity.ok(itemService.addItem(item));
    }

    // Get Item by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getItem(@PathVariable Long id) {
        Item item = itemService.getItemById(id);
        if (item == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(item);
    }




}

