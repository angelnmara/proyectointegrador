package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.EnterpriseDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.EnterpriseMapper;
import com.lamarrulla.proyectointegrador.entity.Enterprise;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EnterpriseMapperImpl implements EnterpriseMapper {
    @Override
    public EnterpriseDTO toDTO(Enterprise enterprise) {
        EnterpriseDTO enterpriseDTO = new EnterpriseDTO();
        enterpriseDTO.setDescEnterprise(enterprise.getDescEnterprise());
        enterpriseDTO.setIdEnterprise(enterprise.getIdEnterprise());
        return enterpriseDTO;
    }

    @Override
    public List<EnterpriseDTO> toDTOList(List<Enterprise> enterpriseList) {
        return enterpriseList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public Enterprise toEntity(EnterpriseDTO enterpriseDTO) {
        Enterprise enterprise = new Enterprise();
        enterprise.setDescEnterprise(enterpriseDTO.getDescEnterprise());
        enterprise.setIdEnterprise(enterpriseDTO.getIdEnterprise());
        return enterprise;
    }
}
