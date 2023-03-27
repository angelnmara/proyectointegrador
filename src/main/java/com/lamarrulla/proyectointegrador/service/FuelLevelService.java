package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.FuelLevelDTO;

import java.util.List;

public interface FuelLevelService {
    FuelLevelDTO findById(Integer id);
    List<FuelLevelDTO> findAll();
    FuelLevelDTO save(FuelLevelDTO fuelLevelDTO);
    void deleteById(Integer id);
}
