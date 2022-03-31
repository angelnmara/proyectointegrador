package com.lamarrulla.proyectointegrador.service;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;

public interface ArticleService {
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO findArticle(Long id);
}
