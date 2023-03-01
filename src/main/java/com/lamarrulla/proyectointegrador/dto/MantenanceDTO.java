package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Unit;
import lombok.Data;
@Data
public class MantenanceDTO {
    int idMantenance;
    Unit unit;
    String pieza;
    String evidencia;
    String observaciones;
    String usuario;
}
