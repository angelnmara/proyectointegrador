package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.KindDTO;

import java.util.List;

public interface KindService {
    KindDTO findById(Integer id);
    List<KindDTO> findAll();
    KindDTO save(KindDTO kindDTO);
    void delete(Integer id);
}
