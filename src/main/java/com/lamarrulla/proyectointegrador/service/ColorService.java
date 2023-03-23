package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.ColorDTO;

import java.util.List;

public interface ColorService {
    ColorDTO findById(Integer id);
    List<ColorDTO> findAll();
    ColorDTO save(ColorDTO colorDTO);
    void delete(Integer id);
}
