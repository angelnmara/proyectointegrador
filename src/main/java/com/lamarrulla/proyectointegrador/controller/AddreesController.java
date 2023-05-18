package com.lamarrulla.proyectointegrador.controller;

import com.lamarrulla.proyectointegrador.dto.AddreesDTO;
import com.lamarrulla.proyectointegrador.service.AddreesService;
import com.lamarrulla.proyectointegrador.vo.DeleteMsg;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addrees")
public class AddreesController {
    private final AddreesService addreesService;

    public AddreesController(AddreesService addreesService) {
        this.addreesService = addreesService;
    }

    @ApiOperation( value = "Obtiene dirección por Id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping("/{id}")
    public ResponseEntity<AddreesDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok(addreesService.findById(id));
    }

    @ApiOperation( value = "Nueva dirección")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PostMapping
    public ResponseEntity<AddreesDTO> save(@RequestBody AddreesDTO addreesDTO){
        return ResponseEntity.ok(addreesService.save(addreesDTO));
    }

    @ApiOperation( value = "Actiualiza dirección")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @PutMapping
    public ResponseEntity<AddreesDTO> update(@RequestBody AddreesDTO addreesDTO){
        return ResponseEntity.ok(addreesService.save(addreesDTO));
    }

    @ApiOperation( value = "Obtiene tod@s l@s direcciones")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @GetMapping
    public ResponseEntity<List<AddreesDTO>> findAll(){
        return ResponseEntity.ok(addreesService.findAll());
    }

    @ApiOperation( value = "Borra dirección por id")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Respuesta correcta"),
            @ApiResponse( code = 401, message = "No está autorizado para ver este recurso"),
            @ApiResponse( code = 403, message = "Está prohibido acceder al recurso"),
            @ApiResponse( code = 404, message = "No se encuentra el recurso")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        addreesService.deleteById(id);
        DeleteMsg deleteMsg = new DeleteMsg("direccion");
        String mensaje = "Dirección borrada exitosamente";//deleteMsg.getValue();
        return ResponseEntity.ok(mensaje);
    }

}
