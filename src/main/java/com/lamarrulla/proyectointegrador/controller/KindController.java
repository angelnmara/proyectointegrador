package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.KindDTO;
import com.lamarrulla.proyectointegrador.service.KindService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kind")
public class KindController {
    private final KindService kindService;

    public KindController(KindService kindService) {
        this.kindService = kindService;
    }

    @ApiOperation( value = "Obtiene tipo por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<KindDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(kindService.findById(id));
    }

    @ApiOperation( value = "Nueva tipo")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<KindDTO> save(@RequestBody KindDTO kindDTO){
        return ResponseEntity.ok(kindService.save(kindDTO));
    }

    @ApiOperation( value = "Actiualiza tipos")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<KindDTO> update(@RequestBody KindDTO kindDTO){
        return ResponseEntity.ok(kindService.save(kindDTO));
    }

    @ApiOperation( value = "Obtiene todos los tipos")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })

    @GetMapping
    public ResponseEntity<List<KindDTO>> findAll(){
        return ResponseEntity.ok(kindService.findAll());
    }

    @ApiOperation( value = "Borra tipo por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        kindService.deleteById(id);
        DeleteMsg deleteMsg = new DeleteMsg("tipo");
        String mensaje = "Tipo borrado exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }

}
