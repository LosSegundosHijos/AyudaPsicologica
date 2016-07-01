/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Paciente;
import Vista.VistaConfirmacion;
import Vista.VistaCuentaFuncionario;
import Vista.VistaCuentaProfesional;
import Vista.VistaFicha;
import java.io.FileReader;

/**
 *
 * @author nicoo
 */
public class ControladorCuenta{

    private VistaCuentaFuncionario vCuentaFun;
    private VistaCuentaProfesional vCuentaPro;
    private VistaFicha vF;
    private ControladorPrincipal cP;
    private boolean flagTipoCuenta = false;
    
    public ControladorCuenta(ControladorPrincipal aThis, String tipoCuenta){
        if(tipoCuenta == "Funcionario"){
            vCuentaFun = new VistaCuentaFuncionario(this);
            vCuentaFun.setVisible(true);
            flagTipoCuenta = true;
        }else if(tipoCuenta == "Profesional"){
            vCuentaPro = new VistaCuentaProfesional(this);
            vCuentaPro.setVisible(true);
            flagTipoCuenta = false;
        }
        this.cP = aThis;
    }

    public void cerrarSesion() {
        if(flagTipoCuenta){
            vCuentaFun.dispose();
        }else{
            vCuentaPro.dispose();
        }
        cP.cerrarSesion();
    }

    public void abrirTalleres() {
        System.out.println("Rut de paciente: " + vCuentaFun.demePacienteQM());
        cP.abrirTalleres();
        if(flagTipoCuenta){
            vCuentaFun.setEnabled(false);
        }else{
            vCuentaPro.setEnabled(false);
        }
    }

    public void abrirAgendamiento() {
        cP.abrirAgendamiento();
        if(flagTipoCuenta){
            vCuentaFun.setEnabled(false);
        }else{
            vCuentaPro.setEnabled(false);
        }
    }

    public void abrirFicha() {
        if(flagTipoCuenta){
            if(cP.validarRut(vCuentaFun.demePacienteQM())){
                vCuentaFun.setEnabled(false);
                vF = new VistaFicha(this);
                vF.setVisible(true);
            }else{
                vCuentaFun.MuestreRutInvalidoFM();
            }
        }else{
            if(cP.validarRut(vCuentaPro.demePacienteQM())){
                vCuentaPro.setEnabled(false);
                vF = new VistaFicha(this);
                vF.setVisible(true);
            }else{
                vCuentaPro.MuestreRutInvalidoFM();
            }
        }
        
    }    

    public void volverCuentaDesdeFicha() {
        if(flagTipoCuenta){
            vCuentaFun.setVisible(true);
            vCuentaFun.setEnabled(true);
        }else{       
            vCuentaPro.setVisible(true);
            vCuentaPro.setEnabled(true);
        }
        vF.dispose();
    }

    void volverCuentaDesdeAgendamiento() {
        if(flagTipoCuenta){
            vCuentaFun.setVisible(true);
            vCuentaFun.setEnabled(true);
        }else{      
            vCuentaPro.setVisible(true);
            vCuentaPro.setEnabled(true);
        }
    }

    
}
