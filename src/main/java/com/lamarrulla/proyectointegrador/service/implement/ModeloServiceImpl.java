package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ModeloMapper;
import com.lamarrulla.proyectointegrador.repository.ModelRespository;
import com.lamarrulla.proyectointegrador.service.ModeloService;
import org.springframework.stereotype.Service;

@Service
public class ModeloServiceImpl implements ModeloService {

    private final ModelRespository modelRespository;
    private final ModeloMapper modeloMapper;

    public ModeloServiceImpl(ModelRespository modelRespository, ModeloMapper modeloMapper) {
        this.modelRespository = modelRespository;
        this.modeloMapper = modeloMapper;
    }

    @Override
    public ModeloDTO save(ModeloDTO modeloDTO) {
        return modeloMapper.toDTO(modelRespository.save(modeloMapper.toEnitty(modeloDTO)));
    }
}
