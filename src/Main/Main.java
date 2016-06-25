/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.ControladorPrincipal;

/**
 *
 * @author nicoo
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando aplicación");
        //Punto de partida de la aplicacion desde el ControladorPrincipal
        //Se declara un ControladorPPrincipal
        Controlador.ControladorPrincipal cPrincipal;
        //Se inicializa el objeto Controlador Principal instanciado
        cPrincipal = new ControladorPrincipal();
    }
}
