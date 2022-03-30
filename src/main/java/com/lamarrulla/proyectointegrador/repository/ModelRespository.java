package com.lamarrulla.proyectointegrador.repository;

import com.lamarrulla.proyectointegrador.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRespository extends JpaRepository<Model, Long> {
}
