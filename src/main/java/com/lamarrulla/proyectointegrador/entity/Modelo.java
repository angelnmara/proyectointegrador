package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="model")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idModel;
    String description;
    @ManyToOne //(cascade=CascadeType.ALL)
    private Brand brand;
}
