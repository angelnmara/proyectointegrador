package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.ColorDTO;
import com.lamarrulla.proyectointegrador.entity.Color;

import java.util.List;

public interface ColorMapper {
    ColorDTO toDTO(Color color);
    List<ColorDTO> toDTOList(List<Color> colorList);
    Color toEntity(ColorDTO colorDTO);
}
