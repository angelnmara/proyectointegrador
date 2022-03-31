package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.BrandMapper;
import com.lamarrulla.proyectointegrador.repository.BrandRepository;
import com.lamarrulla.proyectointegrador.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    public BrandServiceImpl(BrandRepository brandRepository, BrandMapper brandMapper) {
        this.brandRepository = brandRepository;
        this.brandMapper = brandMapper;
    }

    @Override
    public BrandDTO findById(Long id) {
        return brandMapper.toDTO(brandRepository.findById(id).get());
    }

    @Override
    public List<BrandDTO> findAll() {
        return brandMapper.toDTOList(brandRepository.findAll());
    }

    @Override
    public BrandDTO save(BrandDTO brandDTO) {
        return brandMapper.toDTO(brandRepository.save(brandMapper.toEntity(brandDTO)));
    }

    @Override
    public void delete(BrandDTO brandDTO) {
        brandRepository.delete(brandMapper.toEntity(brandDTO));
    }
}
