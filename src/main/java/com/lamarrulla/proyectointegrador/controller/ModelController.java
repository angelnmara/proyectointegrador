package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.ModelDTO;
import com.lamarrulla.proyectointegrador.service.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @PostMapping("/model")
    public ResponseEntity<ModelDTO> saveModelo(@RequestBody ModelDTO modelDTO){
        return ResponseEntity.ok(modelService.save(modelDTO));
    }

    @PutMapping("/model")
    public ResponseEntity<ModelDTO> updateModelo(@RequestBody ModelDTO modelDTO){
        return ResponseEntity.ok(modelService.save(modelDTO));
    }

    @GetMapping("/model/{id}")
    public ResponseEntity<ModelDTO> getModelo(@PathVariable Integer id){
        return ResponseEntity.ok(modelService.findById(id));
    }

    @GetMapping("/model")
    public ResponseEntity<List<ModelDTO>> getModelo(){
        return ResponseEntity.ok(modelService.findAll());
    }

    @DeleteMapping("/model/{id}")
    public ResponseEntity<String> deleteModelo(@PathVariable Integer id){
        modelService.deleteById(id);
        return ResponseEntity.ok("Modelo eliminado correctamente");
    }
}
