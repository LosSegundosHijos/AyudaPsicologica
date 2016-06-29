/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author nicoo
 */
public class Usuario {
    private String Correo;
    private String Password;
    private Integer TelefonoContacto;
    private String Nombre;
    private String Apellidos;

    public Usuario(String Correo, String Password, Integer TelefonoContacto, String Nombre, String Apellidos) {
        this.Correo = Correo;
        this.Password = Password;
        this.TelefonoContacto = TelefonoContacto;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Integer getTelefonoContacto() {
        return TelefonoContacto;
    }

    public void setTelefonoContacto(Integer TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellidos;
    }

    public void setApellido(String Apellido) {
        this.Apellidos = Apellido;
    }
    
    
    
    
}
