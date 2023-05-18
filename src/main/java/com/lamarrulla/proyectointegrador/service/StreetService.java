package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.StreetDTO;

import java.util.List;

public interface StreetService {
    StreetDTO findById(Integer id);
    List<StreetDTO> findAll();
    StreetDTO save(StreetDTO streetDTO);
    void deleteById(Integer id);
}
