package com.proyectoggg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_compras;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_cliente")
    private Cliente clientes;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_carro")
    private Carro carros;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_agencia")
    private Agencia agencias;

}
