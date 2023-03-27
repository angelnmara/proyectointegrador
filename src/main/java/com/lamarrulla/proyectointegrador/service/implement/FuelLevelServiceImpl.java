package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.FuelLevelDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.FuelLevelMapper;
import com.lamarrulla.proyectointegrador.repository.FuelLevelRepository;
import com.lamarrulla.proyectointegrador.service.FuelLevelService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FuelLevelServiceImpl implements FuelLevelService {

    private final FuelLevelRepository fuelLevelRepository;
    private final FuelLevelMapper fuelLevelMapper;

    public FuelLevelServiceImpl(FuelLevelRepository fuelLevelRepository, FuelLevelMapper fuelLevelMapper) {
        this.fuelLevelRepository = fuelLevelRepository;
        this.fuelLevelMapper = fuelLevelMapper;
    }

    @Override
    public FuelLevelDTO findById(Integer id) {
        return fuelLevelMapper.toDTO(fuelLevelRepository.findById(id).get());
    }

    @Override
    public List<FuelLevelDTO> findAll() {
        return fuelLevelMapper.toDTOList(fuelLevelRepository.findAll());
    }

    @Override
    public FuelLevelDTO save(FuelLevelDTO fuelLevelDTO) {
        return fuelLevelMapper.toDTO(fuelLevelRepository.save(fuelLevelMapper.toEntity(fuelLevelDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        fuelLevelRepository.deleteById(id);
    }
}
