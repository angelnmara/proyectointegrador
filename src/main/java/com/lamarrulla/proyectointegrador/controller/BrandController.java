package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.service.BrandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/brand/{id}")
    public ResponseEntity<BrandDTO> getBrandById(@PathVariable Long id){
        return ResponseEntity.ok(brandService.findById(id));
    }

    @PostMapping("/brand")
    public ResponseEntity<BrandDTO> save(@RequestBody BrandDTO brandDTO){
        return ResponseEntity.ok(brandService.save(brandDTO));
    }
}
