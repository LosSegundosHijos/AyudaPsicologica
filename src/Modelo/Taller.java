/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author nicoo
 */
public class Taller {
    private String Nombre;
    private String Descripcion;
    private int CupoMaximo;
    private List<Bloque> horarios;

    public Taller(String Nombre, String Descripcion, int CupoMaximo) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.CupoMaximo = CupoMaximo;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCupoMaximo() {
        return CupoMaximo;
    }

    public void setCupoMaximo(int CupoMaximo) {
        this.CupoMaximo = CupoMaximo;
    }
    
    
}
