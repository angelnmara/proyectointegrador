package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Brand;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import lombok.Data;

@Data
public class ArticleDTO {
    int idArticle;
    int sku;
    String description;
    Double cost;
    Double retailPrice;
    int stock;
    private Brand brand;
    private Modelo modelo;
}
