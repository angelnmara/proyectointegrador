package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.StreetDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.StreetMapper;
import com.lamarrulla.proyectointegrador.repository.StreetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StreetServiceImpl implements StreetService{
    private final StreetRepository streetRepository;
    private final StreetMapper streetMapper;

    public StreetServiceImpl(StreetRepository streetRepository, StreetMapper streetMapper) {
        this.streetRepository = streetRepository;
        this.streetMapper = streetMapper;
    }

    @Override
    public StreetDTO findById(Integer id) {
        return streetMapper.toDTO(streetRepository.findById(id).get());
    }

    @Override
    public List<StreetDTO> findAll() {
        return streetMapper.toDTOList(streetRepository.findAll());
    }

    @Override
    public StreetDTO save(StreetDTO streetDTO) {
        return streetMapper.toDTO(streetRepository.save(streetMapper.toEntity(streetDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        streetRepository.deleteById(id);
    }
}
