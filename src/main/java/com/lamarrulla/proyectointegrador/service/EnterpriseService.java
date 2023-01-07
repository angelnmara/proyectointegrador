package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.EnterpriseDTO;

import java.util.List;

public interface EnterpriseService {
    EnterpriseDTO findById(Integer idEnterprise);
    List<EnterpriseDTO> findAll();
    EnterpriseDTO save(EnterpriseDTO enterpriseDTO);
    void delete(Integer idEnterprise);
}
