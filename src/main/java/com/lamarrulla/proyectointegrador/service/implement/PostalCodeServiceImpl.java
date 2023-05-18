package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.PostalCodeDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.PostalCodeMapper;
import com.lamarrulla.proyectointegrador.repository.PostalCodeRepository;
import com.lamarrulla.proyectointegrador.service.PostalCodeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostalCodeServiceImpl implements PostalCodeService {
    private final PostalCodeRepository postalCodeRepository;
    private final PostalCodeMapper postalCodeMapper;

    public PostalCodeServiceImpl(PostalCodeRepository postalCodeRepository, PostalCodeMapper postalCodeMapper) {
        this.postalCodeRepository = postalCodeRepository;
        this.postalCodeMapper = postalCodeMapper;
    }

    @Override
    public PostalCodeDTO findById(Integer id) {
        return postalCodeMapper.toDTO(postalCodeRepository.findById(id).get());
    }

    @Override
    public List<PostalCodeDTO> findAll() {
        return postalCodeMapper.toDTOList(postalCodeRepository.findAll());
    }

    @Override
    public PostalCodeDTO save(PostalCodeDTO postalCodeDTO) {
        return postalCodeMapper.toDTO(postalCodeRepository.save(postalCodeMapper.toEntity(postalCodeDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        postalCodeRepository.deleteById(id);
    }
}
