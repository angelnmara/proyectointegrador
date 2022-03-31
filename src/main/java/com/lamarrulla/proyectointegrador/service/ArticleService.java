package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;

import java.util.List;

public interface ArticleService {
    ArticleDTO save(ArticleDTO articleDTO);
    ArticleDTO findById(Long id);
    List<ArticleDTO> findAll();
    void delete(ArticleDTO articleDTO);
}
