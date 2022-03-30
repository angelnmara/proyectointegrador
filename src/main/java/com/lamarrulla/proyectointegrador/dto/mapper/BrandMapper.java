package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.entity.Brand;
import org.mapstruct.Mapper;

@Mapper
public interface BrandMapper {
    BrandDTO toDTO(Brand brand);
    Brand toEntity(BrandDTO brandDTO);
}
