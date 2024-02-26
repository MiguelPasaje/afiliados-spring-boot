package com.prueba.api.controller;

import com.prueba.api.model.Afiliado;
import com.prueba.api.service.AfiliadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Afiliados")
public class AfiliadoController {

    @Autowired
    private AfiliadoService afiliadoService;

    @PostMapping
    public ResponseEntity<?> createAfiliado(@RequestBody Afiliado afiliado) {
        Afiliado nuevoAfiliado = afiliadoService.createAfiliado(afiliado);
        return ResponseEntity.ok(nuevoAfiliado);
    }
    @GetMapping
    public ResponseEntity<List<Afiliado>> getAllAfiliados() {
        List<Afiliado> afiliados = afiliadoService.getAllAfiliados();
        return ResponseEntity.ok(afiliados);
    }

    @GetMapping("{id}")
    public ResponseEntity<Afiliado> getAfiliadoById(@PathVariable("id") Long id){
        Afiliado afiliado = afiliadoService.getAfiliadoById(id);
        return ResponseEntity.ok(afiliado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteAfiliadoById(@PathVariable("id") Long id){
        afiliadoService.deleteAfiliado(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Afiliado> updateAfiliado(@PathVariable("id") Long id, @RequestBody Afiliado nuevosDatosAfiliado){
        Afiliado afiliadoActualizado = afiliadoService.updateAfiliado(id, nuevosDatosAfiliado);
        return ResponseEntity.ok(afiliadoActualizado);
    }
}
