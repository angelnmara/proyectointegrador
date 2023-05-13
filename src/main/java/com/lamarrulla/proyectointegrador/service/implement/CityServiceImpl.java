package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.CityDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.CityMapper;
import com.lamarrulla.proyectointegrador.repository.CityRepository;
import com.lamarrulla.proyectointegrador.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    public CityServiceImpl(CityRepository cityRepository, CityMapper cityMapper) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    @Override
    public CityDTO findById(Integer id) {
        return cityMapper.toDTO(cityRepository.findById(id).stream().findFirst().get());
    }

    @Override
    public List<CityDTO> findAll() {
        return cityMapper.toDTOList(cityRepository.findAll());
    }

    @Override
    public CityDTO save(CityDTO cityDTO) {
        return cityMapper.toDTO(cityRepository.save(cityMapper.toEntity(cityDTO)));
    }

    @Override
    public void delete(Integer id) {
        cityRepository.deleteById(id);
    }
}
