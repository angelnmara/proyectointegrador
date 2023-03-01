package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.MaintenanceDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.MantenanceMapper;
import com.lamarrulla.proyectointegrador.entity.Maintenance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MantenanceMapperImpl implements MantenanceMapper {

    @Override
    public MaintenanceDTO toDTO(Maintenance maintenance) {
        MaintenanceDTO maintenanceDTO = new MaintenanceDTO();
        maintenanceDTO.setIdMaintenance(maintenance.getIdMaintenance());
        maintenanceDTO.setEvidencia(maintenance.getEvidencia());
        maintenanceDTO.setPieza(maintenance.getPieza());
        maintenanceDTO.setObservaciones(maintenance.getObservaciones());
        maintenanceDTO.setUsuario(maintenance.getUsuario());
        maintenanceDTO.setUnit(maintenance.getUnit());
        return maintenanceDTO;
    }

    @Override
    public Maintenance toEntity(MaintenanceDTO maintenanceDTO) {
        Maintenance maintenance = new Maintenance();
        maintenance.setEvidencia(maintenanceDTO.getEvidencia());
        maintenance.setObservaciones(maintenanceDTO.getObservaciones());
        maintenance.setUsuario(maintenanceDTO.getUsuario());
        maintenance.setPieza(maintenanceDTO.getPieza());
        maintenance.setIdMaintenance(maintenance.getIdMaintenance());
        maintenance.setUnit(maintenanceDTO.getUnit());
        return maintenance;
    }

    @Override
    public List<MaintenanceDTO> toDTOList(List<Maintenance> maintenanceList) {
        return maintenanceList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
