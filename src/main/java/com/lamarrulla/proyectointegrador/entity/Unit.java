package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="unit")
public class Unit {
    @Id
    @GeneratedValue
    int idUnit;
    @Column(unique=true)
    String noEcon;
    String plates;
    @OneToOne
    @JoinColumn(name="idModel", referencedColumnName = "idModel")
    Modelo idModel;
    @OneToOne
    @JoinColumn(name="idColor", referencedColumnName = "idColor")
    Color idColor;
    String operador;
    String imagen;
    @OneToOne
    @JoinColumn(name="idEnterprise", referencedColumnName = "idEnterprise")
    Enterprise idEnterprise;
}
