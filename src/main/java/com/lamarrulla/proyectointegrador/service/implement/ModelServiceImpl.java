package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.ModelDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ModelMapper;
import com.lamarrulla.proyectointegrador.repository.ModelRespository;
import com.lamarrulla.proyectointegrador.service.ModelService;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRespository modelRespository;
    private final ModelMapper modelMapper;

    public ModelServiceImpl(ModelRespository modelRespository, ModelMapper modelMapper) {
        this.modelRespository = modelRespository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ModelDTO save(ModelDTO modelDTO) {
        return modelMapper.toDTO(modelRespository.save(modelMapper.toEnitty(modelDTO)));
    }
}
