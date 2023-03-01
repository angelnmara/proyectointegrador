package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.MaintenanceDTO;
import com.lamarrulla.proyectointegrador.service.MaintenanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaintenanceController {
    private final MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @PostMapping("/maintenance")
    public ResponseEntity<MaintenanceDTO> save(@RequestBody MaintenanceDTO maintenanceDTO){
        return ResponseEntity.ok(maintenanceService.save(maintenanceDTO));
    }
    @GetMapping("/maintenance/all")
    public ResponseEntity<List<MaintenanceDTO>> get(){
        return ResponseEntity.ok(maintenanceService.getAll());
    }
}
