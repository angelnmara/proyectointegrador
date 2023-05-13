package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.CountryDTO;

import java.util.List;

public interface CountryService {
    CountryDTO findById(Integer id);
    List<CountryDTO> findAll();
    CountryDTO save(CountryDTO countryDTO);
    void delete(Integer id);
}
