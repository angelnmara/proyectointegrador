package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.ModelDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ModeloMapper;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import com.lamarrulla.proyectointegrador.repository.ModelRespository;
import com.lamarrulla.proyectointegrador.service.ModelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRespository modelRespository;
    private final ModeloMapper modeloMapper;

    public ModelServiceImpl(ModelRespository modelRespository, ModeloMapper modeloMapper) {
        this.modelRespository = modelRespository;
        this.modeloMapper = modeloMapper;
    }

    @Override
    public ModelDTO save(ModelDTO modelDTO) {
        Modelo modelo = modelRespository.save(modeloMapper.toEnitty(modelDTO));
        return modeloMapper.toDTO(modelo);
    }

    @Override
    public ModelDTO findById(Integer id) {
        return modeloMapper.toDTO(modelRespository.findById(id).get());
    }

    @Override
    public List<ModelDTO> findAll() {
        return modeloMapper.toDTOList(modelRespository.findAll());
    }

    @Override
    public void deleteById(Integer id) {
        modelRespository.delete(modeloMapper.toEnitty(findById(id)));
    }
}
