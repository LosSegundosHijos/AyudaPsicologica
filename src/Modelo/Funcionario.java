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
public class Funcionario {
    private boolean Mantenedor;

    public Funcionario(boolean Mantenedor) {
        this.Mantenedor = Mantenedor;
    }

    public boolean isMantenedor() {
        return Mantenedor;
    }

    public void setMantenedor(boolean Mantenedor) {
        this.Mantenedor = Mantenedor;
    }
    
}
