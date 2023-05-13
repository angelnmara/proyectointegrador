package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idState;
    String state;
    @ManyToOne
    @JoinColumn(name="idCountry", referencedColumnName = "idCountry")
    Country idCountry;
}
