package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Unit;
import lombok.Data;
@Data
public class MantenimientoDTO {
    int idMantenimiento;
    Unit unit;
    String pieza;
    String evidencia;
    String observaciones;
    String usuario;
}
