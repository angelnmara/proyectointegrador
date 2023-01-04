package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.MantenimientoDTO;

import java.util.List;

public interface MantenimientoService {
    MantenimientoDTO save(MantenimientoDTO mantenimientoDTO);
    MantenimientoDTO findById(Integer id);
    List<MantenimientoDTO> getAll();
}
