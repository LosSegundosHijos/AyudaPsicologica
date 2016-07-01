/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaTalleres;

/**
 *
 * @author nicoo
 */
public class ControladorTalleres {
    private ControladorPrincipal cP;
    private VistaTalleres vT;
        
    public ControladorTalleres(ControladorPrincipal aThis) {
        cP = aThis;
        vT = new VistaTalleres();
        vT.setVisible(true);
    }
    
}
