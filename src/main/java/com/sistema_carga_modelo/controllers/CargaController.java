package com.sistema_carga_modelo.controllers;

import com.sistema_carga_modelo.Service.CargaService;
import com.sistema_carga_modelo.domain.Carga;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cargas")
@RequiredArgsConstructor
public class CargaController {
    private final CargaService cargaService;


    @GetMapping
    public ResponseEntity<List<Carga>> listCargas() {

        List<Carga> cargas = cargaService.listAll();
        return ResponseEntity.ok(cargas);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Carga> createCarga(@RequestBody Carga carga) {
        return new ResponseEntity<>(cargaService.save(carga), HttpStatus.CREATED);

    }

}
