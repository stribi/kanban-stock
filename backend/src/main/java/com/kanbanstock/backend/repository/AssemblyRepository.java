package com.kanbanstock.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanstock.backend.model.Assembly;

public interface AssemblyRepository extends JpaRepository<Assembly, Long> {

    Assembly findByCode(String code);

}
