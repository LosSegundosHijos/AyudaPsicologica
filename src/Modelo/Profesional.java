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
public class Profesional extends Usuario {

    private String Cargo;

    public Profesional(String Cargo, String Correo, String Password, Integer TelefonoContacto, String Nombre, String Apellidos, String RUT) {
        super(Correo, Password, TelefonoContacto, Nombre, Apellidos, RUT);
        this.Cargo = Cargo;
    }
    
    

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
      
}
