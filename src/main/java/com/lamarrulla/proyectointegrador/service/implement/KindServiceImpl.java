package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.KindDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.KindMapper;
import com.lamarrulla.proyectointegrador.repository.KindRepository;
import com.lamarrulla.proyectointegrador.service.KindService;

import java.util.List;

public class KindServiceImpl implements KindService {

    private final KindRepository kindRepository;
    private final KindMapper kindMapper;

    public KindServiceImpl(KindRepository kindRepository, KindMapper kindMapper) {
        this.kindRepository = kindRepository;
        this.kindMapper = kindMapper;
    }

    @Override
    public KindDTO findById(Integer id) {
        return kindMapper.toDTO(kindRepository.findById(id).stream().findFirst().get());
    }

    @Override
    public List<KindDTO> findAll() {
        return null;
    }

    @Override
    public KindDTO save(KindDTO kindDTO) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
