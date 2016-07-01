/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.logging.Logger;

/**
 *
 * @author nicoo
 */
public class Sesion {
    private boolean inicial;
    private String Descripcion;

    public Sesion(boolean inicial, String Descripcion) {
        this.inicial = inicial;
        this.Descripcion = Descripcion;
    }

    public boolean isInicial() {
        return inicial;
    }

    public void setInicial(boolean inicial) {
        this.inicial = inicial;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
