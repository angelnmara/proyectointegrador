package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idColor;
    String descColor;
}
