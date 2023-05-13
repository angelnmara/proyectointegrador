package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.StreetDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.StreetMapper;
import com.lamarrulla.proyectointegrador.entity.Street;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StreetMapperImpl implements StreetMapper {
    @Override
    public StreetDTO toDTO(Street street) {
        StreetDTO streetDTO = new StreetDTO();
        streetDTO.setIdStreet(streetDTO.getIdStreet());
        streetDTO.setNameStreet(streetDTO.getNameStreet());
        return streetDTO;
    }

    @Override
    public List<StreetDTO> toDTOList(List<Street> streets) {
        return streets.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public Street toEntity(StreetDTO streetDTO) {
        Street street = new Street();
        street.setIdStreet(streetDTO.getIdStreet());
        street.setNameStreet(streetDTO.getNameStreet());
        return street;
    }
}
