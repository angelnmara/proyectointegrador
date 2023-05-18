package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.PostalCodeDTO;

import java.util.List;

public interface PostalCodeService {
    PostalCodeDTO findById(Integer id);
    List<PostalCodeDTO> findAll();
    PostalCodeDTO save(PostalCodeDTO postalCodeDTO);
    void deleteById(Integer id);
}
