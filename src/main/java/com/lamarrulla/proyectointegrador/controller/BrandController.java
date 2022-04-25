package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.BrandDTO;
import com.lamarrulla.proyectointegrador.service.BrandService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @ApiOperation( value = "Obtiene marca por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/brand/{id}")
    public ResponseEntity<BrandDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(brandService.findById(id));
    }

    @ApiOperation( value = "Nueva marca")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping("/brand")
    public ResponseEntity<BrandDTO> save(@RequestBody BrandDTO brandDTO){
        return ResponseEntity.ok(brandService.save(brandDTO));
    }

    @ApiOperation( value = "Actiualiza marca")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping("/brand")
    public ResponseEntity<BrandDTO> update(@RequestBody BrandDTO brandDTO){
        return ResponseEntity.ok(brandService.save(brandDTO));
    }

    @ApiOperation( value = "Obtiene todos los articulos")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })

    @GetMapping("/brand")
    public ResponseEntity<List<BrandDTO>> findAll(){
        return ResponseEntity.ok(brandService.findAll());
    }

    @ApiOperation( value = "Borra articulo por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/brand/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        brandService.delete(id);
        DeleteMsg deleteMsg = new DeleteMsg("marca");
        String mensaje = "Marca borrada exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }
}
