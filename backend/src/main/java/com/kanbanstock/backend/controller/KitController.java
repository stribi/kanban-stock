package com.kanbanstock.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
