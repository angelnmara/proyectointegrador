package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.MaintenanceDTO;
import com.lamarrulla.proyectointegrador.entity.Maintenance;

import java.util.List;

public interface MantenanceMapper {
    MaintenanceDTO toDTO(Maintenance maintenance);
    Maintenance toEntity(MaintenanceDTO maintenanceDTO);
    List<MaintenanceDTO> toDTOList(List<Maintenance> maintenanceList);
}
