package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;
import com.lamarrulla.proyectointegrador.service.ArticleService;
import com.lamarrulla.proyectointegrador.vo.Delete;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article/{id}")
    public ResponseEntity<ArticleDTO> getArticle(@PathVariable Long id){
        return ResponseEntity.ok(articleService.findById(id));
    }

    @GetMapping("/article")
    public ResponseEntity<List<ArticleDTO>> getArticle(){
        return ResponseEntity.ok(articleService.findAll());
    }

    @PostMapping("/article")
    public ResponseEntity<ArticleDTO> saveArticle(@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok(articleService.save(articleDTO));
    }

    @PutMapping("/article")
    public ResponseEntity<ArticleDTO> updateArticle(@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok(articleService.save(articleDTO));
    }

    @DeleteMapping("/article")
    public ResponseEntity<String> deleteArticle(@RequestBody ArticleDTO articleDTO){
        articleService.delete(articleDTO);
        return ResponseEntity.ok(new Delete("articulo").getValue());
    }
}
