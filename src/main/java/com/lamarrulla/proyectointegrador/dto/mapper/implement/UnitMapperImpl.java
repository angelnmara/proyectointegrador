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
        unitDTO.setIdColor(unit.getIdColor());
        unitDTO.setIdModel(unit.getIdModel());
        unitDTO.setIdUnit(unit.getIdUnit());
        unitDTO.setPlates(unit.getPlates());
        unitDTO.setOperador(unit.getOperador());
        unitDTO.setNoEcon(unit.getNoEcon());
        unitDTO.setImagen(unit.getImagen());
        unitDTO.setIdEnterprise(unit.getIdEnterprise());
        return unitDTO;
    }

    @Override
    public Unit toEnity(UnitDTO unitDTO) {
        Unit unit = new Unit();
        unit.setIdColor(unitDTO.getIdColor());
        unit.setIdModel(unitDTO.getIdModel());
        unit.setPlates(unitDTO.getPlates());
        unit.setOperador(unitDTO.getOperador());
        unit.setNoEcon(unitDTO.getNoEcon());
        unit.setIdUnit(unitDTO.getIdUnit());
        unit.setImagen(unitDTO.getImagen());
        unit.setIdEnterprise(unitDTO.getIdEnterprise());
        return unit;
    }

    @Override
    public List<UnitDTO> toDTOList(List<Unit> unitList) {
        return unitList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
