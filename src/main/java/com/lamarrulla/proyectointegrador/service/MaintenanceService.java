package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.MaintenanceDTO;

import java.util.List;

public interface MaintenanceService {
    MaintenanceDTO save(MaintenanceDTO maintenanceDTO);
    MaintenanceDTO findById(Integer id);
    List<MaintenanceDTO> getAll();
}
