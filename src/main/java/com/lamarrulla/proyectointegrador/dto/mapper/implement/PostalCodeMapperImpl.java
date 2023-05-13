package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.PostalCodeDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.PostalCodeMapper;
import com.lamarrulla.proyectointegrador.entity.PostalCode;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class PostalCodeMapperImpl implements PostalCodeMapper {
    @Override
    public PostalCodeDTO toDTO(PostalCode postalCode) {
        PostalCodeDTO postalCodeDTO = new PostalCodeDTO();
        postalCodeDTO.setIdPostalCode(postalCode.getIdPostalCode());
        postalCodeDTO.setPostalCode(postalCode.getPostalCode());
        return postalCodeDTO;
    }

    @Override
    public List<PostalCodeDTO> toDTOList(List<PostalCode> postalCodeList) {
        return postalCodeList.stream().map(z->toDTO(z)).collect(Collectors.toList());
    }

    @Override
    public PostalCode toEntity(PostalCodeDTO postalCodeDTO) {
        PostalCode postalCode = new PostalCode();
        postalCode.setIdPostalCode(postalCodeDTO.getIdPostalCode());
        postalCode.setPostalCode(postalCodeDTO.getPostalCode());
        return postalCode;
    }
}
