package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.UnitDTO;

import java.util.List;

public interface UnitService {
    UnitDTO save(UnitDTO unitDTO);
    UnitDTO findById(Integer id);
    List<UnitDTO> findAll();
    void deleteById(Integer id);

}
