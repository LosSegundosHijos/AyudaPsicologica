/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaRegistro;

/**
 *
 * @author nicoo
 */
public class ControladorRegistro {
    private VistaRegistro vReg;
    private ControladorPrincipal cP;
    
    public ControladorRegistro(ControladorPrincipal aThis) {
        this.cP = aThis;
        this.vReg = new VistaRegistro(this);
        this.vReg.setVisible(true);
        vReg.setLocationRelativeTo(null);
    }

    public void volver() {
        vReg.dispose();
        cP.volverRegistro();
    }

    public void registrar() {
        vReg.dispose();
        System.out.println("Registro aceptado");
        //Aca se utilizan los parametros para almacenar la info del usuario
        cP.volverRegistro();
    }
    
}
