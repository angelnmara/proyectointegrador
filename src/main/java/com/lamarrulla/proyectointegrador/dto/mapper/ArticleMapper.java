package com.lamarrulla.proyectointegrador.dto.mapper;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;
import com.lamarrulla.proyectointegrador.entity.Article;
import org.mapstruct.Mapper;

@Mapper
public interface ArticleMapper {
    ArticleDTO toDTO(Article article);
    Article toEntity(ArticleDTO articleDTO);
}
