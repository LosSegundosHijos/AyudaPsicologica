/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaPrincipal;
/**
 *
 * @author nicoo
 */
public class ControladorPrincipal {
    private VistaPrincipal vP;
    private ControladorAdministracionTalleres cAdminTalleres;
    private ControladorAgendamientoHoras cAgendHoras;
    private ControladorAutenticacion cAuten;
    private ControladorCuenta cCuenta;
    private ControladorMantenimiento cManten;
    private ControladorRegistro cReg;
    private ControladorTest cTest;
    
    public ControladorPrincipal(){
        vP = new VistaPrincipal(this);
    }
    
    public void autenticar()
    {
        
    }

    public void cerrar() {
        System.exit(0);
    }
}
