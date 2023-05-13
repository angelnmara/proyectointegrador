package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.AddreesDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.AddreesMapper;
import com.lamarrulla.proyectointegrador.entity.Addrees;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddreesMapperImpl implements AddreesMapper {
    @Override
    public AddreesDTO toDTO(Addrees addrees) {
        AddreesDTO addreesDTO = new AddreesDTO();
        addreesDTO.setIdAddress(addrees.getIdAddress());
        addreesDTO.setNumber(addrees.getNumber());
        addreesDTO.setIdCity(addrees.getIdCity());
        addreesDTO.setIdStreet(addrees.getIdStreet());
        addreesDTO.setIdPostalCode(addrees.getIdPostalCode());
        return addreesDTO;
    }

    @Override
    public List<AddreesDTO> toDTOList(List<Addrees> addreesList) {
        return addreesList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public Addrees toEntity(AddreesDTO addreesDTO) {
        Addrees addrees = new Addrees();
        addrees.setIdAddress(addreesDTO.getIdAddress());
        addrees.setNumber(addreesDTO.getNumber());
        addrees.setIdCity(addreesDTO.getIdCity());
        addrees.setIdStreet(addreesDTO.getIdStreet());
        addrees.setIdPostalCode(addreesDTO.getIdPostalCode());
        return addrees;
    }
}
