package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Modelo;
import lombok.Data;

@Data
public class InventoryDTO {
    int idInventory;
    String sku;
    String description;
    Double cost;
    Double retailPrice;
    int stock;
    private Modelo modelo;
}
