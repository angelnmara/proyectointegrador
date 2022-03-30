package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.entity.Brand;
import org.mapstruct.Mapper;

@Mapper
public interface BrandMapper {
    public BrandDTO toDTO(Brand brand);
    public Brand toEntity(BrandDTO brandDTO);
}
