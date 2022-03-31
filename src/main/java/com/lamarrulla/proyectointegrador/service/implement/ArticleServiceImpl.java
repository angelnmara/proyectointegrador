package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ArticleMapper;
import com.lamarrulla.proyectointegrador.repository.ArticleRepository;
import com.lamarrulla.proyectointegrador.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    public ArticleServiceImpl(ArticleRepository articleRepository, ArticleMapper articleMapper) {
        this.articleRepository = articleRepository;
        this.articleMapper = articleMapper;
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return articleMapper.toDTO(articleRepository.save(articleMapper.toEntity(articleDTO)));
    }

    @Override
    public ArticleDTO findArticle(Long id) {
        return articleMapper.toDTO(articleRepository.findById(id).get());
    }
}
