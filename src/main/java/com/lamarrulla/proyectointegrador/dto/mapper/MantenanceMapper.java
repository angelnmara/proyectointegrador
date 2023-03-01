package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.MantenanceDTO;
import com.lamarrulla.proyectointegrador.entity.Mantenance;

import java.util.List;

public interface MantenanceMapper {
    MantenanceDTO toDTO(Mantenance mantenance);
    Mantenance toEntity(MantenanceDTO mantenanceDTO);
    List<MantenanceDTO> toDTOList(List<Mantenance> mantenanceList);
}
