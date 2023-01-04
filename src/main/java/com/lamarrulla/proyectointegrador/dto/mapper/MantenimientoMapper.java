package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.MantenimientoDTO;
import com.lamarrulla.proyectointegrador.entity.Mantenimiento;

import java.util.List;

public interface MantenimientoMapper {
    MantenimientoDTO toDTO(Mantenimiento mantenimiento);
    Mantenimiento toEntity(MantenimientoDTO mantenimientoDTO);
    List<MantenimientoDTO> toDTOList(List<Mantenimiento> mantenimientoList);
}
