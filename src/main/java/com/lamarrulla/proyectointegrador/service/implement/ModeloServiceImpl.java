package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ModeloMapper;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import com.lamarrulla.proyectointegrador.repository.ModelRespository;
import com.lamarrulla.proyectointegrador.service.ModeloService;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Modelo modelo = modelRespository.save(modeloMapper.toEnitty(modeloDTO));
        return modeloMapper.toDTO(modelo);
    }

    @Override
    public ModeloDTO findById(Long id) {
        return modeloMapper.toDTO(modelRespository.findById(id).get());
    }

    @Override
    public List<ModeloDTO> findAll() {
        return modeloMapper.toDTOList(modelRespository.findAll());
    }

    @Override
    public void delete(ModeloDTO modeloDTO) {
        modelRespository.delete(modeloMapper.toEnitty(modeloDTO));
    }
}
