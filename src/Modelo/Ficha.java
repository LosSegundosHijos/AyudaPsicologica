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
public class Ficha {
    private int Prioridad = 0;

    public Ficha(int Prioridad) {
        this.Prioridad = Prioridad;
    }

    public Ficha() {
        
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }
    
    
}
