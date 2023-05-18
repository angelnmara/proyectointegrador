package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.StateDTO;
import com.lamarrulla.proyectointegrador.repository.StateRepository;
import com.lamarrulla.proyectointegrador.service.StateService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class StateController {
    private final StateService stateService;
    private final StateRepository stateRepository;

    public StateController(StateService stateService,
                           StateRepository stateRepository) {
        this.stateService = stateService;
        this.stateRepository = stateRepository;
    }

    @ApiOperation( value = "Obtiene estado por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<StateDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(stateService.findById(id));
    }

    @ApiOperation( value = "Nuev@ estado")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<StateDTO> save(@RequestBody StateDTO stateDTO){
        return ResponseEntity.ok(stateService.save(stateDTO));
    }

    @ApiOperation( value = "Actiualiza estado")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<StateDTO> update(@RequestBody StateDTO stateDTO){
        return ResponseEntity.ok(stateService.save(stateDTO));
    }

    @ApiOperation( value = "Obtiene tod@s l@s estados")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping
    public ResponseEntity<List<StateDTO>> findAll(){
        return ResponseEntity.ok(stateService.findAll());
    }

    @ApiOperation( value = "Borra estado por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        stateService.deleteById(id);
        DeleteMsg deleteMsg = new DeleteMsg("estado");
        String mensaje = "Estado borrad@ exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }
}
