package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.AddreesDTO;

import java.util.List;

public interface AddreesService {
    AddreesDTO findById(Integer id);
    List<AddreesDTO> findAll();
    AddreesDTO save(AddreesDTO addreesDTO);
    void deleteById(Integer id);
}
