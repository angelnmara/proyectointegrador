package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ModeloMapper;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModeloMapperImpl implements ModeloMapper {
    @Override
    public ModeloDTO toDTO(Modelo modelo) {
        ModeloDTO modeloDTO = new ModeloDTO();
        modeloDTO.setBrand(modelo.getBrand());
        modeloDTO.setDescription(modelo.getDescription());
        modeloDTO.setIdModel(modelo.getIdModel());
        return modeloDTO;
    }

    @Override
    public Modelo toEnitty(ModeloDTO modeloDTO) {
        Modelo modelo = new Modelo();
        modelo.setIdModel(modeloDTO.getIdModel());
        modelo.setDescription(modeloDTO.getDescription());
        modelo.setBrand(modeloDTO.getBrand());
        return modelo;
    }

    @Override
    public List<ModeloDTO> toDTOList(List<Modelo> modeloList) {
        return modeloList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
