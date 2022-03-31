package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;

import java.util.List;

public interface ModeloService {
    ModeloDTO save(ModeloDTO modeloDTO);
    ModeloDTO findById(Long id);
    List<ModeloDTO> findAll();
    void delete(ModeloDTO modeloDTO);
}
