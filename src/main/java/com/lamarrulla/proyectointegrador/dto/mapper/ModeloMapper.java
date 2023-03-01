package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.ModelDTO;
import com.lamarrulla.proyectointegrador.entity.Modelo;

import java.util.List;

public interface ModeloMapper {
    ModelDTO toDTO(Modelo modelo);
    Modelo toEnitty(ModelDTO modelDTO);
    List<ModelDTO> toDTOList(List<Modelo> modeloList);
}
