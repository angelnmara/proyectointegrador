package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.StateDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.StateMapper;
import com.lamarrulla.proyectointegrador.repository.StateRepository;
import com.lamarrulla.proyectointegrador.service.StateService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StateServiceImpl implements StateService {
    private final StateRepository stateRepository;
    private final StateMapper stateMapper;

    public StateServiceImpl(StateRepository stateRepository, StateMapper stateMapper) {
        this.stateRepository = stateRepository;
        this.stateMapper = stateMapper;
    }

    @Override
    public StateDTO findById(Integer id) {
        return stateMapper.toDTO(stateRepository.findById(id).get());
    }

    @Override
    public List<StateDTO> findAll() {
        return stateMapper.toDTOList(stateRepository.findAll());
    }

    @Override
    public StateDTO save(StateDTO stateDTO) {
        return stateMapper.toDTO(stateRepository.save(stateMapper.toEntity(stateDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        stateRepository.deleteById(id);
    }
}
