package com.lamarrulla.proyectointegrador.repository;

import com.lamarrulla.proyectointegrador.entity.Addrees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Addrees, Integer> {
}
