/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaAutenticacion;

/**
 *
 * @author nicoo
 */
public class ControladorAutenticacion extends Controlador {
    
    //Agregación de una VistaAutenticación
    //El ControladorAutenticacion tiene una VistaAutenticacion
    private VistaAutenticacion vAuten;
    private ControladorPrincipal cP; 
    
    public ControladorAutenticacion(ControladorPrincipal aThis) {
        cP = aThis;
        vAuten = new VistaAutenticacion(this);
        vAuten.setVisible(true);
    }
    
}
