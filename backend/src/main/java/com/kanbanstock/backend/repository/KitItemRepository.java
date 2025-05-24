package com.kanbanstock.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanstock.backend.model.KitItem;

public interface KitItemRepository extends JpaRepository<KitItem, Long> {

}
