package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="kind")
public class Kind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idKind;
    String descKind;
}
