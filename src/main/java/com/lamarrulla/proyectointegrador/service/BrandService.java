package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;

import java.util.List;

public interface BrandService {
    BrandDTO findById(Long Id);
    List<BrandDTO> findAll();
    BrandDTO save(BrandDTO brandDTO);
}
