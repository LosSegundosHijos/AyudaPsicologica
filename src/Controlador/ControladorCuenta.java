/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaCuentaFuncionario;
import Vista.VistaCuentaProfesional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author nicoo
 */
public class ControladorCuenta{

    private VistaCuentaFuncionario vCuentaFun;
    private VistaCuentaProfesional vCuentaPro;
    
    public ControladorCuenta(ControladorPrincipal aThis, String tipoCuenta){
        if(tipoCuenta == "Funcionario"){
            vCuentaFun = new VistaCuentaFuncionario(this);
            vCuentaFun.setVisible(true);
        }else if(tipoCuenta == "Profesional"){
            vCuentaPro = new VistaCuentaProfesional(this);
            vCuentaPro.setVisible(true);
        }
    }
    
}
