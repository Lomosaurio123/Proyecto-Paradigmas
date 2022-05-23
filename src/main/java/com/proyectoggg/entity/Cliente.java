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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_Cliente;
    @Column(length = 50, nullable = false)
    private String Nombre;
    @Column(length = 50)
    private String Apellido_m;
    @Column(length = 50, nullable = false)
    private String Apellido_p;
    @Column(length = 50, nullable = false)
    private String Colonia;
    @Column(nullable = false)
    private int CP;
    @Column(length = 50, nullable = false)
    private String Calle;
    @Column(nullable = false)
    private int N_Exterior;
    @Column(length = 50, nullable = false)
    private String Estado;
    @Column(length = 59, nullable = false, unique = true)
    private String Correo;
    private Integer Edad;
    private Integer Tel;



    public Cliente(String nombre, String apellido_m, String apellido_p, String colonia, int cP, String calle,
            int n_Exterior, String estado, String correo, Integer edad, Integer tel) {
        Nombre = nombre;
        Apellido_m = apellido_m;
        Apellido_p = apellido_p;
        Colonia = colonia;
        CP = cP;
        Calle = calle;
        N_Exterior = n_Exterior;
        Estado = estado;
        Correo = correo;
        Edad = edad;
        Tel = tel;
    }

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
