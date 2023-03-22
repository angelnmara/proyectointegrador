package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.KindDTO;
import com.lamarrulla.proyectointegrador.entity.Kind;

import java.util.List;

public interface KindMapper {
    KindDTO toDTO(Kind kind);
    List<KindDTO> toDTOList(List<Kind> kindList);
    Kind toEntity(KindDTO kindDTO);
}
