package com.lamarrulla.proyectointegrador.dto.mapper.implement;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;
import com.lamarrulla.proyectointegrador.dto.mapper.ArticleMapper;
import com.lamarrulla.proyectointegrador.entity.Article;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ArticleMapperImpl implements ArticleMapper {
    @Override
    public ArticleDTO toDTO(Article article) {
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setIdArticle(article.getIdArticle());
        articleDTO.setCost(article.getCost());
        articleDTO.setDescription(article.getDescription());
        articleDTO.setModelo(article.getModelo());
        articleDTO.setSku(article.getSku());
        articleDTO.setStock(article.getStock());
        articleDTO.setRetailPrice(article.getRetailPrice());
        return articleDTO;
    }

    @Override
    public Article toEntity(ArticleDTO articleDTO) {
        Article article = new Article();
        article.setIdArticle(articleDTO.getIdArticle());
        article.setCost(articleDTO.getCost());
        article.setDescription(articleDTO.getDescription());
        article.setModelo(articleDTO.getModelo());
        article.setSku(articleDTO.getSku());
        article.setStock(articleDTO.getStock());
        article.setRetailPrice(articleDTO.getRetailPrice());
        return article;
    }

    @Override
    public List<ArticleDTO> toDTOList(List<Article> articleList) {
        return articleList.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
}
