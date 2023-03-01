package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.ModelDTO;

import java.util.List;

public interface ModelService {
    ModelDTO save(ModelDTO modelDTO);
    ModelDTO findById(Integer id);
    List<ModelDTO> findAll();
    void deleteById(Integer id);
}
