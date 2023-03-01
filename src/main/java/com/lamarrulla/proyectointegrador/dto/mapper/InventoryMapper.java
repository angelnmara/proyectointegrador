package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.InventoryDTO;
import com.lamarrulla.proyectointegrador.entity.Inventory;

import java.util.List;

public interface InventoryMapper {
    InventoryDTO toDTO(Inventory inventory);
    Inventory toEntity(InventoryDTO inventoryDTO);
    List<InventoryDTO> toDTOList(List<Inventory> inventoryList);
}
