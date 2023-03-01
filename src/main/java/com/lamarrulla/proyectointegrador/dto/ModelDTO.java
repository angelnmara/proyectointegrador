package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Brand;
import lombok.Data;

@Data
public class ModelDTO {
    int idModel;
    String description;
    private Brand brand;
}
