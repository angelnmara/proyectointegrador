package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.InventoryDTO;

import java.util.List;

public interface InventoryService {
    InventoryDTO save(InventoryDTO inventoryDTO);
    InventoryDTO findById(Integer id);
    List<InventoryDTO> findAll();
    void delete(InventoryDTO inventoryDTO);
}
