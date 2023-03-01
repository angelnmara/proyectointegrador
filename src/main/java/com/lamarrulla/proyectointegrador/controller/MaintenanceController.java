package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.MantenanceDTO;
import com.lamarrulla.proyectointegrador.service.MantenimientoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaintenanceController {
    private final MantenimientoService mantenimientoService;

    public MaintenanceController(MantenimientoService mantenimientoService) {
        this.mantenimientoService = mantenimientoService;
    }

    @PostMapping("/mantenimiento")
    public ResponseEntity<MantenanceDTO> save(@RequestBody MantenanceDTO mantenanceDTO){
        return ResponseEntity.ok(mantenimientoService.save(mantenanceDTO));
    }
    @GetMapping("/mantenimiento/all")
    public ResponseEntity<List<MantenanceDTO>> get(){
        return ResponseEntity.ok(mantenimientoService.getAll());
    }
}
