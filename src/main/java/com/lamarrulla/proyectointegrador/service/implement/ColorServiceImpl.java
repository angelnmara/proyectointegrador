package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.ColorDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ColorMapper;
import com.lamarrulla.proyectointegrador.repository.ColorRepository;
import com.lamarrulla.proyectointegrador.service.ColorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;
    private final ColorMapper colorMapper;

    public ColorServiceImpl(ColorRepository colorRepository, ColorMapper colorMapper) {
        this.colorRepository = colorRepository;
        this.colorMapper = colorMapper;
    }

    @Override
    public ColorDTO findById(Integer id) {
        return colorMapper.toDTO(colorRepository.findById(id).stream().findFirst().get());
    }

    @Override
    public List<ColorDTO> findAll() {
        return colorMapper.toDTOList(colorRepository.findAll());
    }

    @Override
    public ColorDTO save(ColorDTO colorDTO) {
        return colorMapper.toDTO(colorRepository.save(colorMapper.toEntity(colorDTO)));
    }

    @Override
    public void delete(Integer id) {
        colorRepository.deleteById(id);
    }
}
