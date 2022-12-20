package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="unit")
public class Unit {
    @Id
    @GeneratedValue
    int idUnit;
    String noEcon;
    String placas;
    String tipo;
    String color;
    String operador;
}
