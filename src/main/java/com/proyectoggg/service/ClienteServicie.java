package com.proyectoggg.service;

import java.util.Optional;

import com.proyectoggg.entity.Cliente;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface ClienteServicie {
    
    public Iterable<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Optional<Cliente> findById(Long id);

    public Cliente save(Cliente cliente);

    public void deleteById(Long id);

}
