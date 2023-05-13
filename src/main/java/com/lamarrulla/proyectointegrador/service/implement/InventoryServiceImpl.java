package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.InventoryDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.InventoryMapper;
import com.lamarrulla.proyectointegrador.repository.InventoryRepository;
import com.lamarrulla.proyectointegrador.service.InventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;

    public InventoryServiceImpl(InventoryRepository inventoryRepository, InventoryMapper inventoryMapper) {
        this.inventoryRepository = inventoryRepository;
        this.inventoryMapper = inventoryMapper;
    }

    @Override
    public InventoryDTO save(InventoryDTO inventoryDTO) {
        return inventoryMapper.toDTO(inventoryRepository.save(inventoryMapper.toEntity(inventoryDTO)));
    }

    @Override
    public InventoryDTO findById(Integer id) {
        return inventoryMapper.toDTO(inventoryRepository.findById(id).get());
    }

    @Override
    public List<InventoryDTO> findAll() {
        return inventoryMapper.toDTOList(inventoryRepository.findAll());
    }

    @Override
    public void delete(InventoryDTO inventoryDTO) {
        inventoryRepository.delete(inventoryMapper.toEntity(inventoryDTO));
    }
}
