package com.proyectoggg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carros")
public class Carro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Carro;
    @Column(length = 50, nullable = false)
    private String Modelo;
    private int Year;
    @Column(length = 50, nullable = false)
    private String Tipo;
    @Column(length = 50, nullable = false)
    private String Marca;
    @Column(length = 50)
    private String Color;
    //Creación de tabla relacional

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "agencias_carros",
            joinColumns = { @JoinColumn(name = "id_carro") },
            inverseJoinColumns = { @JoinColumn(name = "id_agencia") }
    )
    private List<Agencia> agencias = new ArrayList<Agencia>();

    //Getters y Setters

    public Long getID_Carro() {
        return ID_Carro;
    }
    public void setID_Carro(Long iD_Carro) {
        ID_Carro = iD_Carro;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        Year = year;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }


}
