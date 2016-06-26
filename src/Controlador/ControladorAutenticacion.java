/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.VistaAutenticacion;

/**
 *
 * @author nicoo
 */
public class ControladorAutenticacion {
    
    //Agregación de una VistaAutenticación
    //El ControladorAutenticacion tiene una VistaAutenticacion
    private VistaAutenticacion vAuten;
    private ControladorPrincipal cP; 
    
    //Contructor de ControladorAutenticacion
    public ControladorAutenticacion(ControladorPrincipal aThis) {
        cP = aThis;
        vAuten = new VistaAutenticacion(this);
        vAuten.setVisible(true);
    }
    
    //Metodo que busca los datos de usuario en un repositorio de informacion 
    //y confirma su existencia dandole el control al controlador principal
    public void autenticar(){
        System.out.println("Autentica: "+ vAuten.demeNombreUsuarioQM());
        System.out.println("Password: "+ vAuten.demePasswordQM());
        vAuten.dispose();
        String tipoCuenta = "Funcionario";
        cP.ingresarCuenta(tipoCuenta, new Usuario());
        
    }

    //Metodo que reporta al Controlador Principal que debe retomar el control
    public void volver() {
        vAuten.dispose();
        cP.volverAutenticacion();
    }
    
}
