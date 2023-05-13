package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.StreetDTO;
import com.lamarrulla.proyectointegrador.entity.Street;

import java.util.List;

public interface StreetMapper {
    StreetDTO toDTO(Street street);
    List<StreetDTO> toDTOList(List<Street> streets);
    Street toEntity(StreetDTO streetDTO);
}
