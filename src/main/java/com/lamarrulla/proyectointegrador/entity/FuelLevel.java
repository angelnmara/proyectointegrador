package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="fuellevel")
public class FuelLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idFuelLevel;
    @OneToOne
    @JoinColumn(name="idUnit", referencedColumnName = "idUnit")
    Unit idUnit;
    Date fuelLevelDate;
    Double fuelLevelInit;
    Double fuelLevelEnd;
    String fuelLevelInitImage;
    String fuelLevelEndImage;
}
