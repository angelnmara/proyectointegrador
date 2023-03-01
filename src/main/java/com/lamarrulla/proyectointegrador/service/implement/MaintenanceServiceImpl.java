package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.MaintenanceDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.MantenanceMapper;
import com.lamarrulla.proyectointegrador.repository.MantenimientoRepository;
import com.lamarrulla.proyectointegrador.service.MaintenanceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {
    private final MantenimientoRepository mantenimientoRepository;
    private final MantenanceMapper mantenanceMapper;

    public MaintenanceServiceImpl(MantenimientoRepository mantenimientoRepository, MantenanceMapper mantenanceMapper) {
        this.mantenimientoRepository = mantenimientoRepository;
        this.mantenanceMapper = mantenanceMapper;
    }

    @Override
    public MaintenanceDTO save(MaintenanceDTO maintenanceDTO) {
        return mantenanceMapper.toDTO(mantenimientoRepository.save(mantenanceMapper.toEntity(maintenanceDTO)));
    }

    @Override
    public MaintenanceDTO findById(Integer id) {
        return mantenanceMapper.toDTO(mantenimientoRepository.findById(id).get());
    }

    @Override
    public List<MaintenanceDTO> getAll() {
        return mantenanceMapper.toDTOList(mantenimientoRepository.findAll());
    }
}
