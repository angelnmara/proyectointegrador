package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.CityDTO;

import java.util.List;

public interface CityService {
    CityDTO findById(Integer id);
    List<CityDTO> findAll();
    CityDTO save(CityDTO cityDTO);
    void delete(Integer id);
}
