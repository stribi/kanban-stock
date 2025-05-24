package com.kanbanstock.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanbanstock.backend.dto.ItemQuantityDTO;
import com.kanbanstock.backend.dto.KitWithItemsDTO;
import com.kanbanstock.backend.model.Item;
import com.kanbanstock.backend.model.Kit;
import com.kanbanstock.backend.repository.KitRepository;

@RestController
@RequestMapping("/api/kits")
@CrossOrigin(origins = "http://localhost:3000")
public class KitController {

    private final KitRepository kitRepository;

    public KitController(KitRepository kitRepository){
        this.kitRepository = kitRepository;
    }

    @GetMapping
    public List<Kit> getAllKits(){
        return kitRepository.findAll();
    }

    @GetMapping("/with-items")
    public List<KitWithItemsDTO> getKitsWithItems(){

        List<Kit> kits = kitRepository.findAll();

        return kits.stream().map(kit -> {
            List<ItemQuantityDTO> items = kit.getKitItems().stream().map(kitItem -> {
                Item item = kitItem.getItem();
                return new ItemQuantityDTO(item.getCode(), item.getName(), kitItem.getQuantity());
            }).toList();

            return new KitWithItemsDTO(kit.getId(), kit.getCode(), kit.getName(), items);
        }).toList();



    }

}
