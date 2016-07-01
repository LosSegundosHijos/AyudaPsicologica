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
public class Paciente extends Usuario {
    
    private String Carrera;
    private int Edad;
    private boolean esAlumno;
    private Ficha miFicha = new Ficha();

    public Paciente(String Carrera, int Edad, boolean esAlumno, String Correo, String Password, Integer TelefonoContacto, String Nombre, String Apellidos, String RUT) {
        super(Correo, Password, TelefonoContacto, Nombre, Apellidos, RUT);
        this.Carrera = Carrera;
        this.Edad = Edad;
        this.esAlumno = esAlumno;
    }   
    
    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isEsAlumno() {
        return esAlumno;
    }

    public void setEsAlumno(boolean esAlumno) {
        this.esAlumno = esAlumno;
    }

    public void setFicha(Ficha Ficha){
        this.miFicha = Ficha;
    }
    
    public Ficha getFicha() {
        return miFicha;
    }    
}
