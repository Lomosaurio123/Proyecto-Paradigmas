package com.proyectoggg.controller;


import java.util.Optional;

import com.proyectoggg.entity.Cliente;
import com.proyectoggg.service.ClienteServicie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteServicie clienteServicie;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteServicie.save(cliente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable(value = "id") Long id_cliente) {
        Optional<Cliente> oCliente = clienteServicie.findById(id_cliente);
        
        if(!oCliente.isPresent()) { //En caso de no encontrarlo
            return ResponseEntity.notFound().build();
        } 

        return ResponseEntity.ok(oCliente);

    }


}
