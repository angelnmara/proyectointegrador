package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.CityDTO;
import com.lamarrulla.proyectointegrador.entity.City;

import java.util.List;

public interface CityMapper {
    CityDTO toDTO(City city);
    List<CityDTO> toDTOList(List<City> cityList);
    City toEntity(CityDTO cityDTO);
}
