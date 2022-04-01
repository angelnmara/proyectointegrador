package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.ArticleDTO;
import com.lamarrulla.proyectointegrador.service.ArticleService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @ApiOperation( value = "Obtiene articulos por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/article/{id}")
    public ResponseEntity<ArticleDTO> getArticle(@PathVariable Long id){
        return ResponseEntity.ok(articleService.findById(id));
    }

    @ApiOperation( value = "Obtiene todos los articulos")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/article")
    public ResponseEntity<List<ArticleDTO>> getArticle(){
        return ResponseEntity.ok(articleService.findAll());
    }

    @ApiOperation( value = "Guarda articulo")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping("/article")
    public ResponseEntity<ArticleDTO> saveArticle(@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok(articleService.save(articleDTO));
    }

    @ApiOperation( value = "Actualiza articulo")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping("/article")
    public ResponseEntity<ArticleDTO> updateArticle(@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok(articleService.save(articleDTO));
    }

    @ApiOperation( value = "Borra articulo")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/article")
    public ResponseEntity<String> deleteArticle(@RequestBody ArticleDTO articleDTO){
        articleService.delete(articleDTO);
        return ResponseEntity.ok(new DeleteMsg("marca").getValue());
    }
}
