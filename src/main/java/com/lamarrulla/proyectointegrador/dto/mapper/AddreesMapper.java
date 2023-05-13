package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.AddreesDTO;
import com.lamarrulla.proyectointegrador.entity.Addrees;

import java.util.List;

public interface AddreesMapper {
    AddreesDTO toDTO(Addrees addrees);
    List<AddreesDTO> toDTOList(List<Addrees> addreesList);
    Addrees toEntity(AddreesDTO addreesDTO);
}
