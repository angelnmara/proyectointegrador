package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="municipio_delegacion")
public class MunicipioDelegacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMunicipioDelegacion;
    String municipioDelegacion;
}
