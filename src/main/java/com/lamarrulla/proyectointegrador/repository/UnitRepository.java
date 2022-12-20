package com.lamarrulla.proyectointegrador.repository;

import com.lamarrulla.proyectointegrador.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UnitRepository extends JpaRepository<Unit, Integer> {
    List<Unit> findByNoEconContains(String noEcon);
    List<Unit> findByNoEconLike(@Param("noEcon") String noEcon);
}
