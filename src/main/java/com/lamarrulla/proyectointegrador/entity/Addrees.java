package com.lamarrulla.proyectointegrador.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="addrees")
public class Addrees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAddress;
    int number;
    @OneToOne
    @JoinColumn(name="idStreet", referencedColumnName = "idStreet")
    Street idStreet;
    @OneToOne
    @JoinColumn(name="idPostalCode", referencedColumnName = "idPostalCode")
    PostalCode idPostalCode;
    @OneToOne
    @JoinColumn(name="idMunicipioDelegacion", referencedColumnName = "idMunicipioDelegacion")
    MunicipioDelegacion idMunicipioDelegacion;
    @OneToOne
    @JoinColumn(name="idCity", referencedColumnName = "idCity")
    City idCity;
    @OneToOne
    @JoinColumn(name="idCountry", referencedColumnName = "idCountry")
    Country idCountry;
}
