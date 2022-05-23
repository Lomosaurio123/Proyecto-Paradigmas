package com.proyectoggg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente { 

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Cliente;
    @Column(length = 50, nullable = false)
    private String Nombre;
    @Column(length = 50)
    private String Apellido_m;
    @Column(length = 50, nullable = false)
    private String Apellido_p;
    @Column(length = 50)
    private String Dir;
    @Column(length = 59, nullable = false, unique = true)
    private String Correo;
    private Integer Edad;
    private Integer Tel;

    public Long getID_Cliente() {
        return ID_Cliente;
    }
    public void setID_Cliente(Long iD_Cliente) {
        ID_Cliente = iD_Cliente;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido_m() {
        return Apellido_m;
    }
    public void setApellido_m(String apellido_m) {
        Apellido_m = apellido_m;
    }
    public String getApellido_p() {
        return Apellido_p;
    }
    public void setApellido_p(String apellido_p) {
        Apellido_p = apellido_p;
    }
    public String getDir() {
        return Dir;
    }
    public void setDir(String dir) {
        Dir = dir;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    public Integer getEdad() {
        return Edad;
    }
    public void setEdad(Integer edad) {
        Edad = edad;
    }
    public Integer getTel() {
        return Tel;
    }
    public void setTel(Integer tel) {
        Tel = tel;
    }

    

}
