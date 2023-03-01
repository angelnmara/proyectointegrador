package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.InventoryDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.InventoryMapper;
import com.lamarrulla.proyectointegrador.repository.ArticleRepository;
import com.lamarrulla.proyectointegrador.service.InventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final ArticleRepository articleRepository;
    private final InventoryMapper inventoryMapper;

    public InventoryServiceImpl(ArticleRepository articleRepository, InventoryMapper inventoryMapper) {
        this.articleRepository = articleRepository;
        this.inventoryMapper = inventoryMapper;
    }

    @Override
    public InventoryDTO save(InventoryDTO inventoryDTO) {
        return inventoryMapper.toDTO(articleRepository.save(inventoryMapper.toEntity(inventoryDTO)));
    }

    @Override
    public InventoryDTO findById(Integer id) {
        return inventoryMapper.toDTO(articleRepository.findById(id).get());
    }

    @Override
    public List<InventoryDTO> findAll() {
        return inventoryMapper.toDTOList(articleRepository.findAll());
    }

    @Override
    public void delete(InventoryDTO inventoryDTO) {
        articleRepository.delete(inventoryMapper.toEntity(inventoryDTO));
    }
}
