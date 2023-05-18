package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.StreetDTO;
import com.lamarrulla.proyectointegrador.service.StreetService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calle")
public class StreetController {
    private final StreetService streetService;

    public StreetController(StreetService streetService) {
        this.streetService = streetService;
    }

    @ApiOperation( value = "Obtiene calle por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<StreetDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(streetService.findById(id));
    }

    @ApiOperation( value = "Nuev@ calle")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<StreetDTO> save(@RequestBody StreetDTO streetDTO){
        return ResponseEntity.ok(streetService.save(streetDTO));
    }

    @ApiOperation( value = "Actiualiza calle")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<StreetDTO> update(@RequestBody StreetDTO streetDTO){
        return ResponseEntity.ok(streetService.save(streetDTO));
    }

    @ApiOperation( value = "Obtiene tod@s l@s calles")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping
    public ResponseEntity<List<StreetDTO>> findAll(){
        return ResponseEntity.ok(streetService.findAll());
    }

    @ApiOperation( value = "Borra calle por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        streetService.deleteById(id);
        DeleteMsg deleteMsg = new DeleteMsg("calle");
        String mensaje = "Calle borrad@ exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }
}
