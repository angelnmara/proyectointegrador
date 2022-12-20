package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.UnitDTO;
import com.lamarrulla.proyectointegrador.service.UnitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UnitController {
    private final UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @PostMapping("/unit")
    public ResponseEntity<UnitDTO> saveUnit(@RequestBody UnitDTO unitDTO){
        return ResponseEntity.ok(unitService.save(unitDTO));
    }

    @PutMapping("/unit")
    public ResponseEntity<UnitDTO> updateUnit(@RequestBody UnitDTO unitDTO){
        return ResponseEntity.ok(unitService.save(unitDTO));
    }

    @GetMapping("/unit/{id}")
    public ResponseEntity<UnitDTO> getUnit(@PathVariable Integer id){
        return ResponseEntity.ok(unitService.findById(id));
    }

    @GetMapping("/unit")
    public ResponseEntity<List<UnitDTO>> getUnit(){
        return ResponseEntity.ok(unitService.findAll());
    }

    @DeleteMapping("/unit")
    public ResponseEntity<String> deleteUnit(@PathVariable Integer id){
        unitService.deleteById(id);
        return ResponseEntity.ok("Unidad eliminada satisfacoriamente");
    }

    @GetMapping("/unit/noEcon/{noEcon}")
    public ResponseEntity<List<UnitDTO>> getUnitByNoEcon(@PathVariable String noEcon){
        StringBuilder stringBuilder =  new StringBuilder("%");
        stringBuilder.append(noEcon).append("%");
        List<UnitDTO> unitDTOList = unitService.findByNoEconLike(stringBuilder.toString());
        return ResponseEntity.ok(unitDTOList);
    }

}
