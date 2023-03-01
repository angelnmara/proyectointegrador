package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.InventoryDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.InventoryMapper;
import com.lamarrulla.proyectointegrador.entity.Inventory;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InventoryMapperImpl implements InventoryMapper {
    @Override
    public InventoryDTO toDTO(Inventory inventory) {
        InventoryDTO inventoryDTO = new InventoryDTO();
        inventoryDTO.setIdInventory(inventory.getIdInventory());
        inventoryDTO.setCost(inventory.getCost());
        inventoryDTO.setDescription(inventory.getDescription());
        inventoryDTO.setModelo(inventory.getModelo());
        inventoryDTO.setSku(inventory.getSku());
        inventoryDTO.setStock(inventory.getStock());
        inventoryDTO.setRetailPrice(inventory.getRetailPrice());
        return inventoryDTO;
    }

    @Override
    public Inventory toEntity(InventoryDTO inventoryDTO) {
        Inventory inventory = new Inventory();
        inventory.setIdInventory(inventoryDTO.getIdInventory());
        inventory.setCost(inventoryDTO.getCost());
        inventory.setDescription(inventoryDTO.getDescription());
        inventory.setModelo(inventoryDTO.getModelo());
        inventory.setSku(inventoryDTO.getSku());
        inventory.setStock(inventoryDTO.getStock());
        inventory.setRetailPrice(inventoryDTO.getRetailPrice());
        return inventory;
    }

    @Override
    public List<InventoryDTO> toDTOList(List<Inventory> inventoryList) {
        return inventoryList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
