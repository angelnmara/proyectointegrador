package com.lamarrulla.proyectointegrador.repository;

import com.lamarrulla.proyectointegrador.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
