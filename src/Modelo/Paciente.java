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
    private String Facultad;
    private String Departamento;
    private String Carrera;
    private int Edad;
    private boolean esAlumno;

    public Paciente(String Correo, String Password, Integer TelefonoContacto, String Nombre, String Apellido) {
        super(Correo, Password, TelefonoContacto, Nombre, Apellido);
    }

    public Paciente(String Facultad, String Departamento, String Carrera, int Edad, boolean esAlumno, String Correo, String Password, Integer TelefonoContacto, String Nombre, String Apellido) {
        super(Correo, Password, TelefonoContacto, Nombre, Apellido);
        this.Facultad = Facultad;
        this.Departamento = Departamento;
        this.Carrera = Carrera;
        this.Edad = Edad;
        this.esAlumno = esAlumno;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
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
    
    
    
    

    
    
}
