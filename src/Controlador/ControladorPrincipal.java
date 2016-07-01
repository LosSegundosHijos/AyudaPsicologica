/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.VistaConfirmacion;
import Vista.VistaPrincipal;
import java.awt.Dialog;
import javax.swing.JDialog;
/**
 *
 * @author nicoo
 */
public class ControladorPrincipal {
    //Se agrega una VistaPrincipal a Controlador Principal
    private VistaPrincipal vP;
    //Se agregan a continuacion los controladores que le corresponden al controlador principal
    private ControladorTalleres cTalleres;
    private ControladorAgendamiento cAgendamiento;
    private ControladorAutenticacion cAuten;
    private ControladorCuenta cCuenta;
    private ControladorMantenimiento cManten;
    private ControladorRegistro cReg;
    private ControladorTest cTest;
    
    //Constructor de ControladorPrincipal
    public ControladorPrincipal(){
        //Se inicializa la VistaPrincipal pasandole este controlador
        vP = new VistaPrincipal(this);
        //Se declara que la VistaPrincipal se haga visible
        vP.setVisible(true);
    }
    
    //Metodo que inicializa el controlador de autenticacion
    public void autenticar()
    {
        vP.dispose();
        cAuten = new ControladorAutenticacion(this);
    }

    //Este metodo cierra y corta el Thread principal de la aplicacion
    public void cerrar() {
        vP.dispose();
        System.out.println("Cerrando aplicación");
        System.exit(0);
    }
    
    //Metodo que inicializa el controlador de registro
    public void registrar() {
        vP.dispose();
        cReg = new ControladorRegistro(this);
    }

    //Metodo que genera nuevamente la vista 
    //principal luego de volver desde el controlador de autenticacion
    public void volverAutenticacion() {
        cAuten = null;
        vP = new VistaPrincipal(this);
        vP.setVisible(true);
    }
    
    //Metodo que genera nuevamente la vista
    //principal luego de volver desde el controlador de registro
    public void volverRegistro(){
        cReg = null;
        vP = new VistaPrincipal(this);
        vP.setVisible(true);
    }

    //Metodo que se encarga de ingresar a una cuenta y su respectivo controlador
    public void ingresarCuenta(String tipoCuenta, Usuario user) {
       vP.dispose();
       cCuenta = new ControladorCuenta(this,tipoCuenta);
    }

    public void cerrarSesion() {
        vP = new VistaPrincipal(this);
        vP.setVisible(true);
        System.out.println("Sesión cerrada");
    }

    public void abrirTalleres() {
        vP.dispose();
        cTalleres = new ControladorTalleres(this);
    }

    public void abrirAgendamiento() {
        vP.dispose();
        cAgendamiento = new ControladorAgendamiento(this);
    }

    public void volverCuentaDesdeAgendamiento() {
        cCuenta.volverCuentaDesdeAgendamiento();
    }
    
    public static boolean validarRut(String rut) {
 
        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    
}
