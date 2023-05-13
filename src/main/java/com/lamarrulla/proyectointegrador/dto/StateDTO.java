package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.Country;
import lombok.Data;

@Data
public class StateDTO {
    int idState;
    String state;
    Country idCountry;
}
