package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.ModelDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ModeloMapper;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModeloMapperImpl implements ModeloMapper {
    @Override
    public ModelDTO toDTO(Modelo modelo) {
        ModelDTO modelDTO = new ModelDTO();
        modelDTO.setIdBrand(modelo.getIdBrand());
        modelDTO.setDescription(modelo.getDescription());
        modelDTO.setIdModel(modelo.getIdModel());
        modelDTO.setIdKind(modelo.getIdKind());
        return modelDTO;
    }

    @Override
    public Modelo toEnitty(ModelDTO modelDTO) {
        Modelo modelo = new Modelo();
        modelo.setIdModel(modelDTO.getIdModel());
        modelo.setDescription(modelDTO.getDescription());
        modelo.setIdBrand(modelDTO.getIdBrand());
        modelo.setIdKind(modelDTO.getIdKind());
        return modelo;
    }

    @Override
    public List<ModelDTO> toDTOList(List<Modelo> modeloList) {
        return modeloList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
