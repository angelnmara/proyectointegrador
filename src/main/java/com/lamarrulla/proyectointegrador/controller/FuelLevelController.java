package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.FuelLevelDTO;
import com.lamarrulla.proyectointegrador.service.FuelLevelService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fuel-level")
public class FuelLevelController {
    private final FuelLevelService fuelLevelService;

    public FuelLevelController(FuelLevelService fuelLevelService) {
        this.fuelLevelService = fuelLevelService;
    }

    @ApiOperation( value = "Obtiene fuel level por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<FuelLevelDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(fuelLevelService.findById(id));
    }

    @ApiOperation( value = "Nuevo fuel level")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<FuelLevelDTO> save(@RequestBody FuelLevelDTO fuelLevelDTO){
        return ResponseEntity.ok(fuelLevelService.save(fuelLevelDTO));
    }

    @ApiOperation( value = "Actiualiza fuel level")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<FuelLevelDTO> update(@RequestBody FuelLevelDTO fuelLevelDTO){
        return ResponseEntity.ok(fuelLevelService.save(fuelLevelDTO));
    }

    @ApiOperation( value = "Obtiene todos fuel level")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })

    @GetMapping
    public ResponseEntity<List<FuelLevelDTO>> findAll(){
        return ResponseEntity.ok(fuelLevelService.findAll());
    }

    @ApiOperation( value = "Borra fuel-level por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        fuelLevelService.deleteById(id);
        DeleteMsg deleteMsg = new DeleteMsg("fuel level");
        String mensaje = "Fuel level borrado exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }

}
