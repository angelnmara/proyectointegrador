package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="mantenimiento")
public class Mantenimiento {
    @Id
    @GeneratedValue
    int idMantenimiento;
    @ManyToOne
    @JoinColumn(name="idUnit", referencedColumnName = "idUnit")
    Unit unit;
    String pieza;
    String evidencia;
    String observaciones;
    String usuario;
}
