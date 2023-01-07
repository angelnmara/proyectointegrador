package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.EnterpriseDTO;
import com.lamarrulla.proyectointegrador.entity.Enterprise;

import java.util.List;

public interface EnterpriseMapper {
    EnterpriseDTO toDTO(Enterprise enterprise);
    List<EnterpriseDTO> toDTOList(List<Enterprise> enterpriseList);
    Enterprise toEntity(EnterpriseDTO enterpriseDTO);
}
