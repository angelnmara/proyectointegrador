package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Color;
import com.lamarrulla.proyectointegrador.entity.Enterprise;
import com.lamarrulla.proyectointegrador.entity.Modelo;
import lombok.Data;

@Data
public class UnitDTO {
    int idUnit;
    String noEcon;
    String plates;
    Modelo idModel;
    Color idColor;
    String operador;
    String imagen;
    Enterprise idEnterprise;
}
