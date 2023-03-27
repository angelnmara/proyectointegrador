package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Brand;
import com.lamarrulla.proyectointegrador.entity.Kind;
import lombok.Data;

@Data
public class ModelDTO {
    int idModel;
    String descModel;
    private Brand idBrand;
    private Kind idKind;
}
