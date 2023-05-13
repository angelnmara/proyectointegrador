package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="street")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idStreet;
    String nameStreet;
}
