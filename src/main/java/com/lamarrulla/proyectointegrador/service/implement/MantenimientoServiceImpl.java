package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.MantenanceDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.MantenanceMapper;
import com.lamarrulla.proyectointegrador.repository.MantenimientoRepository;
import com.lamarrulla.proyectointegrador.service.MantenimientoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoServiceImpl implements MantenimientoService {
    private final MantenimientoRepository mantenimientoRepository;
    private final MantenanceMapper mantenanceMapper;

    public MantenimientoServiceImpl(MantenimientoRepository mantenimientoRepository, MantenanceMapper mantenanceMapper) {
        this.mantenimientoRepository = mantenimientoRepository;
        this.mantenanceMapper = mantenanceMapper;
    }

    @Override
    public MantenanceDTO save(MantenanceDTO mantenanceDTO) {
        return mantenanceMapper.toDTO(mantenimientoRepository.save(mantenanceMapper.toEntity(mantenanceDTO)));
    }

    @Override
    public MantenanceDTO findById(Integer id) {
        return mantenanceMapper.toDTO(mantenimientoRepository.findById(id).get());
    }

    @Override
    public List<MantenanceDTO> getAll() {
        return mantenanceMapper.toDTOList(mantenimientoRepository.findAll());
    }
}
