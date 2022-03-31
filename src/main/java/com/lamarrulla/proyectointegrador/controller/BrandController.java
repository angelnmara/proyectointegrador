package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.service.BrandService;
import com.lamarrulla.proyectointegrador.vo.Delete;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/brand/{id}")
    public ResponseEntity<BrandDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(brandService.findById(id));
    }

    @PostMapping("/brand")
    public ResponseEntity<BrandDTO> save(@RequestBody BrandDTO brandDTO){
        return ResponseEntity.ok(brandService.save(brandDTO));
    }

    @PutMapping("/brand")
    public ResponseEntity<BrandDTO> update(@RequestBody BrandDTO brandDTO){
        return ResponseEntity.ok(brandService.save(brandDTO));
    }

    @GetMapping("/brand")
    public ResponseEntity<List<BrandDTO>> findAll(){
        return ResponseEntity.ok(brandService.findAll());
    }

    @DeleteMapping("/brand")
    public ResponseEntity<String> delete(@RequestBody BrandDTO brandDTO){
        brandService.delete(brandDTO);
        return ResponseEntity.ok(new Delete("marca").toString());
    }
}
