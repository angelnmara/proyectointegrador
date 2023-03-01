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
    String kind;
    String color;
    String operador;
    String imagen;
}
