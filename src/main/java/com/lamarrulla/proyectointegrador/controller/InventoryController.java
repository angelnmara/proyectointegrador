package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.InventoryDTO;
import com.lamarrulla.proyectointegrador.service.InventoryService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @ApiOperation( value = "Obtiene articulos por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/inventory/{id}")
    public ResponseEntity<InventoryDTO> getArticle(@PathVariable Integer id){
        return ResponseEntity.ok(inventoryService.findById(id));
    }

    @ApiOperation( value = "Obtiene todo el inventory")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/inventory")
    public ResponseEntity<List<InventoryDTO>> getArticle(){
        return ResponseEntity.ok(inventoryService.findAll());
    }

    @ApiOperation( value = "Guarda inventory")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping("/article")
    public ResponseEntity<InventoryDTO> saveArticle(@RequestBody InventoryDTO inventoryDTO){
        return ResponseEntity.ok(inventoryService.save(inventoryDTO));
    }

    @ApiOperation( value = "Actualiza inventory")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping("/inventory")
    public ResponseEntity<InventoryDTO> updateArticle(@RequestBody InventoryDTO inventoryDTO){
        return ResponseEntity.ok(inventoryService.save(inventoryDTO));
    }

    @ApiOperation( value = "Borra inventory")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/inventory")
    public ResponseEntity<String> deleteArticle(@RequestBody InventoryDTO inventoryDTO){
        inventoryService.delete(inventoryDTO);
        DeleteMsg deleteMsg= new DeleteMsg("marca");
        String mensaje = "";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }
}
