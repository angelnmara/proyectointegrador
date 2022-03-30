package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idModel;
    String description;
}
