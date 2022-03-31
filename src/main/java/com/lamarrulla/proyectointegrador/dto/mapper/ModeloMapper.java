package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ModeloMapper {
    ModeloDTO toDTO(Modelo modelo);
    Modelo toEnitty(ModeloDTO modeloDTO);
    List<ModeloDTO> toDTOList(List<Modelo> modeloList);
}
