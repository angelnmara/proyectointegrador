package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.MantenanceDTO;

import java.util.List;

public interface MantenimientoService {
    MantenanceDTO save(MantenanceDTO mantenanceDTO);
    MantenanceDTO findById(Integer id);
    List<MantenanceDTO> getAll();
}
