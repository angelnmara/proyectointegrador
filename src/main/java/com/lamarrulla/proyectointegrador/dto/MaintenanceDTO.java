package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Modelo;
import com.lamarrulla.proyectointegrador.entity.Unit;
import lombok.Data;
@Data
public class MaintenanceDTO {
    int idMaintenance;
    Unit unit;
    Modelo idPieza;
    String evidencia;
    String observaciones;
    String usuario;
}
