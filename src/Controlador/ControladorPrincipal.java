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
    private ControladorAdministracionTalleres cAdminTalleres;
    private ControladorAgendamientoHoras cAgendHoras;
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
    void ingresarCuenta(String tipoCuenta, Usuario user) {
       cCuenta = new ControladorCuenta(this,tipoCuenta);
    }
    
    
}
