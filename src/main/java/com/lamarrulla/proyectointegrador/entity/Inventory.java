package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idInventory;
    String sku;
    String description;
    Double cost;
    Double retailPrice;
    int stock;
    @OneToOne
    @JoinColumn(name="idModel")
    private Modelo modelo;
}
