package com.lamarrulla.proyectointegrador.repository;

import com.lamarrulla.proyectointegrador.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
