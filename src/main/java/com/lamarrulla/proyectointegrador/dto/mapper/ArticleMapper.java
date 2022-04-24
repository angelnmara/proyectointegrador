package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;
import com.lamarrulla.proyectointegrador.entity.Article;

import java.util.List;

public interface ArticleMapper {
    ArticleDTO toDTO(Article article);
    Article toEntity(ArticleDTO articleDTO);
    List<ArticleDTO> toDTOList(List<Article> articleList);
}
