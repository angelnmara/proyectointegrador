package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.FuelLevelDTO;
import com.lamarrulla.proyectointegrador.entity.FuelLevel;

import java.util.List;

public interface FuelLevelMapper {
    FuelLevelDTO toDTO(FuelLevel fuelLevel);
    FuelLevel toEntity(FuelLevelDTO fuelLevelDTO);
    List<FuelLevelDTO> toDTOList(List<FuelLevel> fuelLevelList);
}
