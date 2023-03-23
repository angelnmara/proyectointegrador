package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.ColorDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ColorMapper;
import com.lamarrulla.proyectointegrador.entity.Color;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ColorMapperImpl implements ColorMapper {
    @Override
    public ColorDTO toDTO(Color color) {
        ColorDTO colorDTO = new ColorDTO();
        colorDTO.setDescColor(color.getDescColor());
        colorDTO.setIdColor(color.getIdColor());
        return colorDTO;
    }

    @Override
    public List<ColorDTO> toDTOList(List<Color> colorList) {
        return colorList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public Color toEntity(ColorDTO colorDTO) {
        Color color = new Color();
        color.setDescColor(colorDTO.getDescColor());
        color.setIdColor(colorDTO.getIdColor());
        return color;
    }
}
