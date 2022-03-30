package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import org.mapstruct.Mapper;

@Mapper
public interface ModeloMapper {
    ModeloDTO toDTO(Modelo modelo);
    Modelo toEnitty(ModeloDTO modeloDTO);
}
