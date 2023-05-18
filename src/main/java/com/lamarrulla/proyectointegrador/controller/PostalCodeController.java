package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.PostalCodeDTO;
import com.lamarrulla.proyectointegrador.service.PostalCodeService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codigo-postal")
public class PostalCodeController {
    private final PostalCodeService postalCodeService;

    public PostalCodeController(PostalCodeService postalCodeService) {
        this.postalCodeService = postalCodeService;
    }

    @ApiOperation( value = "Obtiene código postal por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<PostalCodeDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(postalCodeService.findById(id));
    }

    @ApiOperation( value = "Nuev@ código postal")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<PostalCodeDTO> save(@RequestBody PostalCodeDTO postalCodeDTO){
        return ResponseEntity.ok(postalCodeService.save(postalCodeDTO));
    }

    @ApiOperation( value = "Actiualiza código postal")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<PostalCodeDTO> update(@RequestBody PostalCodeDTO postalCodeDTO){
        return ResponseEntity.ok(postalCodeService.save(postalCodeDTO));
    }

    @ApiOperation( value = "Obtiene tod@s l@s códigos postales")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping
    public ResponseEntity<List<PostalCodeDTO>> findAll(){
        return ResponseEntity.ok(postalCodeService.findAll());
    }

    @ApiOperation( value = "Borra código postal por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        postalCodeService.deleteById(id);
        DeleteMsg deleteMsg = new DeleteMsg("codigo postal");
        String mensaje = "Código postal borrad@ exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }

}
