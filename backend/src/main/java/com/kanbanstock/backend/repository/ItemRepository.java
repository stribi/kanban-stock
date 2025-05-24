package com.kanbanstock.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanstock.backend.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

    Item findByCode(String code);

}
