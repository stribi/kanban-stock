package com.kanbanstock.backend;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanbanstock.backend.model.Item;
import com.kanbanstock.backend.model.Kit;
import com.kanbanstock.backend.model.KitItem;
import com.kanbanstock.backend.repository.ItemRepository;
import com.kanbanstock.backend.repository.KitItemRepository;
import com.kanbanstock.backend.repository.KitRepository;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final ItemRepository itemRepository;
    private final KitRepository kitRepository;
    private final KitItemRepository kitItemRepository;

    public TestDataLoader(ItemRepository itemRepository, KitRepository kitRepository, KitItemRepository kitItemRepository) {
        this.itemRepository = itemRepository;
        this.kitRepository = kitRepository;
        this.kitItemRepository = kitItemRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("runner started...");






    }
}
