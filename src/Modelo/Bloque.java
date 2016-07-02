/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nicoo
 */
public class Bloque {
    private Calendar FechaHoraInicio;
    private Calendar FechaHoraTermino;
    private boolean Reservado;

    public Bloque(Calendar FechaHoraInicio, Calendar FechaHoraTermino, boolean Reservado) {
        this.FechaHoraInicio = FechaHoraInicio;
        this.FechaHoraTermino = FechaHoraTermino;
        this.Reservado = Reservado;
    }

    public Calendar getFechaHoraInicio() {
        return FechaHoraInicio;
    }

    public void setFechaHoraInicio(Calendar FechaHoraInicio) {
        this.FechaHoraInicio = FechaHoraInicio;
    }

    public Calendar getFechaHoraTermino() {
        return FechaHoraTermino;
    }

    public void setFechaHoraTermino(Calendar FechaHoraTermino) {
        this.FechaHoraTermino = FechaHoraTermino;
    }

    public boolean isReservado() {
        return Reservado;
    }

    public void setReservado(boolean Reservado) {
        this.Reservado = Reservado;
    }
    
}
