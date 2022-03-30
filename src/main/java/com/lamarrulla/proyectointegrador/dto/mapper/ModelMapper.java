package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.ModelDTO;
import com.lamarrulla.proyectointegrador.entity.Model;
import org.mapstruct.Mapper;

@Mapper
public interface ModelMapper {
    ModelDTO toDTO(Model model);
    Model toEnitty(ModelDTO modelDTO);
}
