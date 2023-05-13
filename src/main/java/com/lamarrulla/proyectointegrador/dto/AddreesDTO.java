package com.lamarrulla.proyectointegrador.dto;

import com.lamarrulla.proyectointegrador.entity.*;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
public class AddreesDTO {
    int idAddress;
    int number;
    Street idStreet;
    PostalCode idPostalCode;
    City idCity;
}
