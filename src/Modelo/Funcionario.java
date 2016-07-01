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
public class Funcionario extends Usuario{
    private boolean Mantenedor;

    public Funcionario(boolean Mantenedor, String Correo, String Password, Integer TelefonoContacto, String Nombre, String Apellidos, String RUT) {
        super(Correo, Password, TelefonoContacto, Nombre, Apellidos, RUT);
        this.Mantenedor = Mantenedor;
    }

    

    public boolean isMantenedor() {
        return Mantenedor;
    }

    public void setMantenedor(boolean Mantenedor) {
        this.Mantenedor = Mantenedor;
    }
    
}
