/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Paciente;
import Vista.VistaAgendamiento;
import Vista.VistaConfirmacion;

/**
 *
 * @author nicoo
 */
public class ControladorAgendamiento {
    private ControladorPrincipal cP;
    private VistaAgendamiento vAgenda;
    private Paciente pacienteReservante;
    
    public ControladorAgendamiento(ControladorPrincipal aThis) {
        vAgenda = new VistaAgendamiento(this);
        vAgenda.setVisible(true);
        cP = aThis;
    }

    public void volver() {
        vAgenda.dispose();
        cP.volverCuentaDesdeAgendamiento();
    }    

    public void buscarPaciente() {
        String rut = vAgenda.demeRutCampoRut();
        if(cP.validarRut(rut)){
            System.out.println("Rut válido");
            //Rescatar informacion de paciente desde repositorio en pacienteReservante
            pacienteReservante  = new Paciente("Ingeniería Civil Informática", 22, true, "nicolas.olivares.g@usach.cl", null, 999999999, "Nicolás", "Olivares González", "18.682.452-0");
            vAgenda.MuestreNombrePacienteFM(pacienteReservante.getNombre()+" "+pacienteReservante.getApellidos());
            vAgenda.MuestrePrioridadFM(pacienteReservante.getFicha().getPrioridad());
            vAgenda.MuestreDeshabilitarPacienteFM();
        }else{
            vAgenda.MuestreRutInvalidoFM();
        }
    }
}
