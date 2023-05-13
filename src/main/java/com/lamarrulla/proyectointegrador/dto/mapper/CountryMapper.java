package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.CountryDTO;
import com.lamarrulla.proyectointegrador.entity.Country;

import java.util.List;

public interface CountryMapper {
    CountryDTO toDTO(Country country);
    List<CountryDTO> toDTOList(List<Country> countries);
    Country toEntity(CountryDTO countryDTO);
}
