package com.kanbanstock.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanstock.backend.model.Kit;

public interface KitRepository extends JpaRepository<Kit, Long>{

    Kit findByCode(String code);

}
