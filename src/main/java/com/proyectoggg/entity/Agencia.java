package com.proyectoggg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "agencias")
public class Agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Agencia;
    @Column(length = 50, nullable = false)
    private String Nombre;
    private int Tel;
    @Column(length = 50)
    private String Colonia;
    private int CP;
    @Column(length = 50)
    private String Calle;
    private int N_Exterior;
    @Column(length = 50)
    private String Estado;

    public Long getID_Agencia() {
        return ID_Agencia;
    }
    public void setID_Agencia(Long iD_Agencia) {
        ID_Agencia = iD_Agencia;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getTel() {
        return Tel;
    }
    public void setTel(int tel) {
        Tel = tel;
    }
    public String getColonia() {
        return Colonia;
    }
    public void setColonia(String colonia) {
        Colonia = colonia;
    }
    public int getCP() {
        return CP;
    }
    public void setCP(int cP) {
        CP = cP;
    }
    public String getCalle() {
        return Calle;
    }
    public void setCalle(String calle) {
        Calle = calle;
    }
    public int getN_Exterior() {
        return N_Exterior;
    }
    public void setN_Exterior(int n_Exterior) {
        N_Exterior = n_Exterior;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    
}
