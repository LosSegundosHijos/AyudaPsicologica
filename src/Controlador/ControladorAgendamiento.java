/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Bloque;
import Modelo.Paciente;
import Vista.VistaAgendamiento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import javax.swing.DefaultListModel;

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

    public void cambioDeProfesional() {
        String nombre = vAgenda.demeProfesionalSeleccionadoQM();
        //Con este profesional seleccionado buscar 
        //la informacion de sus bloques        
        Bloque[] horarios = new Bloque[20];
        Calendar inicio = null;
        Calendar fin = null;
        for (int i=0; i< horarios.length;i++){
            int year = 2016;
            int month = 7;
            int day = new Random().nextInt(30);
            int hour = new Random().nextInt(18);
            int minute = new Random().nextInt(59);
            inicio=new GregorianCalendar(year,month,day,hour,minute);
            minute = minute+20;
            fin = new GregorianCalendar(year,month,day,hour,minute);
            horarios[i] = new Bloque(inicio,fin ,false);
        }
        DefaultListModel  model = new DefaultListModel();
        for(int i=0;i<horarios.length;i++){
            model.addElement(
                    horarios[i].getFechaHoraInicio().getDisplayName(Calendar.DAY_OF_WEEK,Calendar.SHORT,Locale.ROOT)+" "+
                    horarios[i].getFechaHoraInicio().getDisplayName(Calendar.MONTH,Calendar.LONG,Locale.ENGLISH)+"/"+
                    String.valueOf(horarios[i].getFechaHoraInicio().get(Calendar.DATE))+" "+
                    String.valueOf(horarios[i].getFechaHoraInicio().get(Calendar.HOUR))+":"+
                    String.valueOf(horarios[i].getFechaHoraInicio().get(Calendar.MINUTE))+ " hasta "+
                    String.valueOf(horarios[i].getFechaHoraTermino().get(Calendar.HOUR))+":"+
                    String.valueOf(horarios[i].getFechaHoraTermino().get(Calendar.MINUTE)));
        }                
        vAgenda.MostrarHorariosFM(model);
    }
}



