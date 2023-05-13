package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.StateDTO;
import com.lamarrulla.proyectointegrador.entity.State;

import java.util.List;

public interface StateMapper {
    StateDTO toDTO(State state);
    List<StateDTO> toDTOList(List<State> stateList);
    State toEntity(StateDTO stateDTO);
}
