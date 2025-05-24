package com.kanbanstock.backend;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanbanstock.backend.model.Item;
import com.kanbanstock.backend.model.Kit;
import com.kanbanstock.backend.repository.ItemRepository;
import com.kanbanstock.backend.repository.KitRepository;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final ItemRepository itemRepository;
    private final KitRepository kitRepository;

    public TestDataLoader(ItemRepository itemRepository, KitRepository kitRepository) {
        this.itemRepository = itemRepository;
        this.kitRepository = kitRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("runner started...");
        Item item = new Item();
        item.setCode("X100");
        item.setName("Test Screw");

        itemRepository.save(item);

        Kit kit = new Kit();
        kit.setCode("X300");
        kit.setName("Structure");

        kitRepository.save(kit);

        System.out.println("Saved Item: " + item.getId() + " - " + item.getName());
        System.out.println("Saved Kit: " + kit.getId() + " - " + kit.getName());
    }
}
