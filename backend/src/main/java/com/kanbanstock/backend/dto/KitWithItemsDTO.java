package com.kanbanstock.backend.dto;

import java.util.List;

public class KitWithItemsDTO {

    public Long id;
    public String code;
    public String name;
    public List<ItemQuantityDTO> items;

    public KitWithItemsDTO(Long id, String code, String name,List<ItemQuantityDTO> items ){
        this.id = id;
        this.code = code;
        this.name = name;
        this.items = items;
    }
}
