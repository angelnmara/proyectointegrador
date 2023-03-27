package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.FuelLevelDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.FuelLevelMapper;
import com.lamarrulla.proyectointegrador.entity.FuelLevel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class FuelLevelMapperImpl implements FuelLevelMapper {
    @Override
    public FuelLevelDTO toDTO(FuelLevel fuelLevel) {
        FuelLevelDTO fuelLevelDTO = new FuelLevelDTO();
        fuelLevelDTO.setFuelLevelDate(fuelLevel.getFuelLevelDate());
        fuelLevelDTO.setFuelLevelEndImage(fuelLevel.getFuelLevelEndImage());
        fuelLevelDTO.setFuelLevelInit(fuelLevel.getFuelLevelInit());
        fuelLevelDTO.setFuelLevelInitImage(fuelLevel.getFuelLevelInitImage());
        fuelLevelDTO.setIdUnit(fuelLevel.getIdUnit());
        fuelLevelDTO.setFuelLevelEnd(fuelLevel.getFuelLevelEnd());
        fuelLevelDTO.setIdFuelLevel(fuelLevel.getIdFuelLevel());
        return fuelLevelDTO;
    }

    @Override
    public FuelLevel toEntity(FuelLevelDTO fuelLevelDTO) {
        FuelLevel fuelLevel = new FuelLevel();
        fuelLevel.setFuelLevelDate(fuelLevelDTO.getFuelLevelDate());
        fuelLevel.setFuelLevelInitImage(fuelLevelDTO.getFuelLevelInitImage());
        fuelLevel.setFuelLevelEndImage(fuelLevelDTO.getFuelLevelEndImage());
        fuelLevel.setFuelLevelInit(fuelLevelDTO.getFuelLevelInit());
        fuelLevel.setFuelLevelEnd(fuelLevelDTO.getFuelLevelEnd());
        fuelLevel.setIdUnit(fuelLevelDTO.getIdUnit());
        fuelLevel.setIdFuelLevel(fuelLevelDTO.getIdFuelLevel());
        return fuelLevel;
    }

    @Override
    public List<FuelLevelDTO> toDTOList(List<FuelLevel> fuelLevelList) {
        return fuelLevelList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
