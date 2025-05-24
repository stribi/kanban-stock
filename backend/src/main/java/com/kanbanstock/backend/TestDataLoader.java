package com.kanbanstock.backend;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanbanstock.backend.model.Item;
import com.kanbanstock.backend.repository.ItemRepository;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public TestDataLoader(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("runner started...");
        Item item = new Item();
        item.setCode("X100");
        item.setName("Test Screw");

        itemRepository.save(item);

        System.out.println("Saved Item: " + item.getId() + " - " + item.getName());
    }
}
