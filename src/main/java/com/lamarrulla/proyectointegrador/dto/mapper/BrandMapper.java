package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.entity.Brand;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {
    BrandDTO toDTO(Brand brand);
    List<BrandDTO> toDTOList(List<Brand> brandList);
    Brand toEntity(BrandDTO brandDTO);
}
