/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaConfirmacion;
import Vista.VistaPrincipal;
/**
 *
 * @author nicoo
 */
public class ControladorPrincipal extends Controlador {
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
    
    public void autenticar()
    {
        cAuten = new ControladorAutenticacion(this);
    }

    //Este metodo cierra y corta el Thread principal de la aplicacion
    public void cerrar() {
        System.exit(0);
    }

    public void registrar() {
        cReg = new ControladorRegistro(this);
    }
}
