package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="maintenance")
public class Maintenance {
    @Id
    @GeneratedValue
    int idMaintenance;
    @ManyToOne
    @JoinColumn(name="idUnit", referencedColumnName = "idUnit")
    Unit unit;
    @OneToOne
    @JoinColumn(name="idPieza", referencedColumnName = "idModel")
    Modelo idPieza;
    String evidencia;
    String observaciones;
    String usuario;
}
