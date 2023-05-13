package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.StateDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.StateMapper;
import com.lamarrulla.proyectointegrador.entity.State;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StateMapperImpl implements StateMapper {
    @Override
    public StateDTO toDTO(State state) {
        StateDTO stateDTO = new StateDTO();
        stateDTO.setState(state.getState());
        stateDTO.setIdState(state.getIdState());
        stateDTO.setIdCountry(state.getIdCountry());
        return stateDTO;
    }

    @Override
    public List<StateDTO> toDTOList(List<State> stateList) {
        return stateList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    @Override
    public State toEntity(StateDTO stateDTO) {
        State state = new State();
        state.setIdCountry(stateDTO.getIdCountry());
        state.setState(stateDTO.getState());
        state.setIdState(stateDTO.getIdState());
        return state;
    }
}
