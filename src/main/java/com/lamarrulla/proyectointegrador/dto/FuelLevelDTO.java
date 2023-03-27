package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Unit;
import lombok.Data;

import java.util.Date;
@Data
public class FuelLevelDTO {
    int idFuelLevel;
    Unit idUnit;
    Date fuelLevelDate;
    Double fuelLevelInit;
    Double fuelLevelEnd;
    String fuelLevelInitImage;
    String fuelLevelEndImage;
}
