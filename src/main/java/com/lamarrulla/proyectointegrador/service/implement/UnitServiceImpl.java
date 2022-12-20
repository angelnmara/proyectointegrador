package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.UnitDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.UnitMapper;
import com.lamarrulla.proyectointegrador.entity.Unit;
import com.lamarrulla.proyectointegrador.repository.ModelRespository;
import com.lamarrulla.proyectointegrador.repository.UnitRepository;
import com.lamarrulla.proyectointegrador.service.UnitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {

    private final UnitRepository unitRepository;
    private final UnitMapper unitMapper;
    private final ModelRespository modelRespository;

    public UnitServiceImpl(UnitRepository unitRepository, UnitMapper unitMapper,
                           ModelRespository modelRespository) {
        this.unitRepository = unitRepository;
        this.unitMapper = unitMapper;
        this.modelRespository = modelRespository;
    }

    @Override
    public UnitDTO save(UnitDTO unitDTO) {
        Unit unit = unitRepository.save(unitMapper.toEnity(unitDTO));
        return unitMapper.toDTO(unit);
    }

    @Override
    public UnitDTO findById(Integer id) {
        return unitMapper.toDTO(unitRepository.findById(id).get());
    }

    @Override
    public List<UnitDTO> findAll() {
        return unitMapper.toDTOList(unitRepository.findAll());
    }

    @Override
    public void deleteById(Integer id) {
        unitRepository.delete(unitMapper.toEnity(findById(id)));
    }

    @Override
    public List<UnitDTO> findByNoEconContains(String noEcon) {
        List<UnitDTO> unitDTOList = unitMapper.toDTOList(unitRepository.findByNoEconContains(noEcon));
        return unitDTOList;
    }

    @Override
    public List<UnitDTO> findByNoEconLike(String noEcon) {
        List<UnitDTO> unitDTOList = unitMapper.toDTOList(unitRepository.findByNoEconLike(noEcon));
        return unitDTOList;
    }
}
