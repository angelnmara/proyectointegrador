package com.lamarrulla.proyectointegrador.service.implement;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ArticleMapper;
import com.lamarrulla.proyectointegrador.repository.ArticleRepository;
import com.lamarrulla.proyectointegrador.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    public ArticleServiceImpl(ArticleRepository articleRepository, ArticleMapper articleMapper) {
        this.articleRepository = articleRepository;
        this.articleMapper = articleMapper;
    }

    @Override
    public ArticleDTO save(ArticleDTO articleDTO) {
        return articleMapper.toDTO(articleRepository.save(articleMapper.toEntity(articleDTO)));
    }

    @Override
    public ArticleDTO findById(Long id) {
        return articleMapper.toDTO(articleRepository.findById(id).get());
    }

    @Override
    public List<ArticleDTO> findAll() {
        return articleMapper.toDTOList(articleRepository.findAll());
    }

    @Override
    public void delete(ArticleDTO articleDTO) {
        articleRepository.delete(articleMapper.toEntity(articleDTO));
    }
}
