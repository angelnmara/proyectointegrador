package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.EnterpriseDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.EnterpriseMapper;
import com.lamarrulla.proyectointegrador.repository.EnterpriseRepository;
import com.lamarrulla.proyectointegrador.service.EnterpriseService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    private final EnterpriseRepository enterpriseRepository;
    private final EnterpriseMapper enterpriseMapper;

    public EnterpriseServiceImpl(EnterpriseRepository enterpriseRepository, EnterpriseMapper enterpriseMapper) {
        this.enterpriseRepository = enterpriseRepository;
        this.enterpriseMapper = enterpriseMapper;
    }

    @Override
    public EnterpriseDTO findById(Integer idEnterprise) {
        return enterpriseMapper.toDTO(enterpriseRepository.findById(idEnterprise).stream().findFirst().get());
    }

    @Override
    public List<EnterpriseDTO> findAll() {
        return enterpriseMapper.toDTOList(enterpriseRepository.findAll());
    }

    @Override
    public EnterpriseDTO save(EnterpriseDTO enterpriseDTO) {
        return enterpriseMapper.toDTO(enterpriseRepository.save(enterpriseMapper.toEntity(enterpriseDTO)));
    }

    @Override
    public void delete(Integer idEnterprise) {
        enterpriseRepository.delete(enterpriseMapper.toEntity(findById(idEnterprise)));
    }
}
