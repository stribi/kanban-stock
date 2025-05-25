package com.kanbanstock.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanstock.backend.model.AssemblyComponent;

public interface AssemblyComponentRepository extends JpaRepository<AssemblyComponent, Long> {

}
