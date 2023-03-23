package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.ColorDTO;
import com.lamarrulla.proyectointegrador.service.ColorService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/color")
public class ColorController {
    private final ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @ApiOperation( value = "Obtiene color por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<ColorDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(colorService.findById(id));
    }

    @ApiOperation( value = "Nuevo color")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<ColorDTO> save(@RequestBody ColorDTO colorDTO){
        return ResponseEntity.ok(colorService.save(colorDTO));
    }

    @ApiOperation( value = "Actiualiza colores")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<ColorDTO> update(@RequestBody ColorDTO colorDTO){
        return ResponseEntity.ok(colorService.save(colorDTO));
    }

    @ApiOperation( value = "Obtiene todos los colores")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })

    @GetMapping
    public ResponseEntity<List<ColorDTO>> findAll(){
        return ResponseEntity.ok(colorService.findAll());
    }

    @ApiOperation( value = "Borra color por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        colorService.delete(id);
        DeleteMsg deleteMsg = new DeleteMsg("color");
        String mensaje = "Color borrado exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }
}