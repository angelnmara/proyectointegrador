package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.PostalCodeDTO;
import com.lamarrulla.proyectointegrador.entity.PostalCode;

import java.util.List;

public interface PostalCodeMapper {
    PostalCodeDTO toDTO(PostalCode postalCode);
    List<PostalCodeDTO> toDTOList(List<PostalCode> postalCodeList);
    PostalCode toEntity(PostalCodeDTO postalCodeDTO);
}
