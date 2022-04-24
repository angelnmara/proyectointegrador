package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.BrandMapper;
import com.lamarrulla.proyectointegrador.entity.Brand;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BrandMapperImpl implements BrandMapper {
    @Override
    public BrandDTO toDTO(Brand brand) {
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setIdBrand(brand.getIdBrand());
        brandDTO.setDescription(brand.getDescription());
        return brandDTO;
    }

    @Override
    public List<BrandDTO> toDTOList(List<Brand> brandList) {
        return brandList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public Brand toEntity(BrandDTO brandDTO) {
        Brand brand = new Brand();
        brand.setIdBrand(brandDTO.getIdBrand());
        brand.setDescription(brandDTO.getDescription());
        return brand;
    }
}
