package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.StateDTO;

import java.util.List;

public interface StateService {
    StateDTO findById(Integer id);
    List<StateDTO> findAll();
    StateDTO save(StateDTO stateDTO);
    void deleteById(Integer id);
}
