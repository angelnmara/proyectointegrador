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
    String descModel;
    @ManyToOne
    @JoinColumn(name="idBrand", referencedColumnName = "idBrand")
    private Brand idBrand;
    @OneToOne
    @JoinColumn(name="idKind", referencedColumnName = "idKind")
    private Kind idKind;
}
