package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.UnitDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.UnitMapper;
import com.lamarrulla.proyectointegrador.entity.Unit;
import com.lamarrulla.proyectointegrador.repository.UnitRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UnitMapperImpl implements UnitMapper {
    private final UnitRepository unitRepository;

    public UnitMapperImpl(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    @Override
    public UnitDTO toDTO(Unit unit) {
        UnitDTO unitDTO = new UnitDTO();
        unitDTO.setColor(unit.getColor());
        unitDTO.setTipo(unit.getTipo());
        unitDTO.setIdUnit(unit.getIdUnit());
        unitDTO.setPlacas(unit.getPlacas());
        unitDTO.setOperador(unit.getOperador());
        unitDTO.setNoEcon(unit.getNoEcon());
        unitDTO.setImagen(unit.getImagen());
        return unitDTO;
    }

    @Override
    public Unit toEnity(UnitDTO unitDTO) {
        Unit unit = new Unit();
        unit.setColor(unitDTO.getColor());
        unit.setTipo(unitDTO.getTipo());
        unit.setPlacas(unitDTO.getPlacas());
        unit.setOperador(unitDTO.getOperador());
        unit.setNoEcon(unitDTO.getNoEcon());
        unit.setIdUnit(unitDTO.getIdUnit());
        unit.setImagen(unitDTO.getImagen());
        return unit;
    }

    @Override
    public List<UnitDTO> toDTOList(List<Unit> unitList) {
        return unitList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
