package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.ModeloDTO;
import com.lamarrulla.proyectointegrador.service.ModeloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModeloController {
    private final ModeloService modeloService;

    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @PostMapping("/model")
    public ResponseEntity<ModeloDTO> saveModelo(@RequestBody ModeloDTO modeloDTO){
        return ResponseEntity.ok(modeloService.save(modeloDTO));
    }

    @PutMapping("/model")
    public ResponseEntity<ModeloDTO> updateModelo(@RequestBody ModeloDTO modeloDTO){
        return ResponseEntity.ok(modeloService.save(modeloDTO));
    }

    @GetMapping("/model/{id}")
    public ResponseEntity<ModeloDTO> getModelo(@PathVariable Integer id){
        return ResponseEntity.ok(modeloService.findById(id));
    }

    @GetMapping("/model")
    public ResponseEntity<List<ModeloDTO>> getModelo(){
        return ResponseEntity.ok(modeloService.findAll());
    }

    @DeleteMapping("/model/{id}")
    public ResponseEntity<String> deleteModelo(@PathVariable Integer id){
        modeloService.deleteById(id);
        return ResponseEntity.ok("Modelo eliminado correctamente");
    }
}
