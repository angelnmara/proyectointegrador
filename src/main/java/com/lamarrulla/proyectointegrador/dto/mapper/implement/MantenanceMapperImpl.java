package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.MantenanceDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.MantenanceMapper;
import com.lamarrulla.proyectointegrador.entity.Mantenance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MantenanceMapperImpl implements MantenanceMapper {

    @Override
    public MantenanceDTO toDTO(Mantenance mantenance) {
        MantenanceDTO mantenanceDTO = new MantenanceDTO();
        mantenanceDTO.setIdMantenance(mantenance.getIdMantenance());
        mantenanceDTO.setEvidencia(mantenance.getEvidencia());
        mantenanceDTO.setPieza(mantenance.getPieza());
        mantenanceDTO.setObservaciones(mantenance.getObservaciones());
        mantenanceDTO.setUsuario(mantenance.getUsuario());
        mantenanceDTO.setUnit(mantenance.getUnit());
        return mantenanceDTO;
    }

    @Override
    public Mantenance toEntity(MantenanceDTO mantenanceDTO) {
        Mantenance mantenance = new Mantenance();
        mantenance.setEvidencia(mantenanceDTO.getEvidencia());
        mantenance.setObservaciones(mantenanceDTO.getObservaciones());
        mantenance.setUsuario(mantenanceDTO.getUsuario());
        mantenance.setPieza(mantenanceDTO.getPieza());
        mantenance.setIdMantenance(mantenance.getIdMantenance());
        mantenance.setUnit(mantenanceDTO.getUnit());
        return mantenance;
    }

    @Override
    public List<MantenanceDTO> toDTOList(List<Mantenance> mantenanceList) {
        return mantenanceList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
