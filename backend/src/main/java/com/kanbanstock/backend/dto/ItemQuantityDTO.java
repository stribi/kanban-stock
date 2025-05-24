package com.kanbanstock.backend.dto;

public class ItemQuantityDTO {
    public String code;
    public String name;
    public int quantity;

    public ItemQuantityDTO(String code, String name, int quantity) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
    }
}
