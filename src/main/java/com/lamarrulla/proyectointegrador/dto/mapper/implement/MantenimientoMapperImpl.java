package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.MantenimientoDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.MantenimientoMapper;
import com.lamarrulla.proyectointegrador.entity.Mantenimiento;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MantenimientoMapperImpl implements MantenimientoMapper {

    @Override
    public MantenimientoDTO toDTO(Mantenimiento mantenimiento) {
        MantenimientoDTO mantenimientoDTO = new MantenimientoDTO();
        mantenimientoDTO.setIdMantenimiento(mantenimiento.getIdMantenimiento());
        mantenimientoDTO.setEvidencia(mantenimiento.getEvidencia());
        mantenimientoDTO.setPieza(mantenimiento.getPieza());
        mantenimientoDTO.setObservaciones(mantenimiento.getObservaciones());
        mantenimientoDTO.setUsuario(mantenimiento.getUsuario());
        mantenimientoDTO.setUnit(mantenimiento.getUnit());
        return mantenimientoDTO;
    }

    @Override
    public Mantenimiento toEntity(MantenimientoDTO mantenimientoDTO) {
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.setEvidencia(mantenimientoDTO.getEvidencia());
        mantenimiento.setObservaciones(mantenimientoDTO.getObservaciones());
        mantenimiento.setUsuario(mantenimientoDTO.getUsuario());
        mantenimiento.setPieza(mantenimientoDTO.getPieza());
        mantenimiento.setIdMantenimiento(mantenimiento.getIdMantenimiento());
        mantenimiento.setUnit(mantenimientoDTO.getUnit());
        return mantenimiento;
    }

    @Override
    public List<MantenimientoDTO> toDTOList(List<Mantenimiento> mantenimientoList) {
        return mantenimientoList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
