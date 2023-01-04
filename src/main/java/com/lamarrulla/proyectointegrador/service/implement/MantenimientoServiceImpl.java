package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.MantenimientoDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.MantenimientoMapper;
import com.lamarrulla.proyectointegrador.repository.MantenimientoRepository;
import com.lamarrulla.proyectointegrador.service.MantenimientoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoServiceImpl implements MantenimientoService {
    private final MantenimientoRepository mantenimientoRepository;
    private final MantenimientoMapper mantenimientoMapper;

    public MantenimientoServiceImpl(MantenimientoRepository mantenimientoRepository, MantenimientoMapper mantenimientoMapper) {
        this.mantenimientoRepository = mantenimientoRepository;
        this.mantenimientoMapper = mantenimientoMapper;
    }

    @Override
    public MantenimientoDTO save(MantenimientoDTO mantenimientoDTO) {
        return mantenimientoMapper.toDTO(mantenimientoRepository.save(mantenimientoMapper.toEntity(mantenimientoDTO)));
    }

    @Override
    public MantenimientoDTO findById(Integer id) {
        return mantenimientoMapper.toDTO(mantenimientoRepository.findById(id).get());
    }

    @Override
    public List<MantenimientoDTO> getAll() {
        return mantenimientoMapper.toDTOList(mantenimientoRepository.findAll());
    }
}
