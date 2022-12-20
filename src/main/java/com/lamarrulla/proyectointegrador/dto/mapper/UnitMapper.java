package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.UnitDTO;
import com.lamarrulla.proyectointegrador.entity.Unit;

import java.util.List;

public interface UnitMapper {
    UnitDTO toDTO(Unit unit);
    Unit toEnity(UnitDTO unitDTO);
    List<UnitDTO> toDTOList(List<Unit> unitList);
}
