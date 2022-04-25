package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;

import java.util.List;

public interface ModeloService {
    ModeloDTO save(ModeloDTO modeloDTO);
    ModeloDTO findById(Integer id);
    List<ModeloDTO> findAll();
    void deleteById(Integer id);
}
