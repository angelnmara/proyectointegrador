package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.EnterpriseDTO;
import com.lamarrulla.proyectointegrador.service.EnterpriseService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    private final EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @ApiOperation( value = "Obtiene empresa por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<EnterpriseDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(enterpriseService.findById(id));
    }

    @ApiOperation( value = "Nueva Empresa")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<EnterpriseDTO> save(@RequestBody EnterpriseDTO enterpriseDTO){
        return ResponseEntity.ok(enterpriseService.save(enterpriseDTO));
    }

    @ApiOperation( value = "Actiualiza Empresa")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<EnterpriseDTO> update(@RequestBody EnterpriseDTO enterpriseDTO){
        return ResponseEntity.ok(enterpriseService.save(enterpriseDTO));
    }

    @ApiOperation( value = "Obtiene todas las empresas")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })

    @GetMapping
    public ResponseEntity<List<EnterpriseDTO>> findAll(){
        return ResponseEntity.ok(enterpriseService.findAll());
    }

    @ApiOperation( value = "Borra empresa por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        enterpriseService.delete(id);
        DeleteMsg deleteMsg = new DeleteMsg("marca");
        String mensaje = "Empresa borrada exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }
}
