/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author nicoo
 */
public class Bloque {
    private Date FechaHoraInicio;
    private Date FechaHoraTermino;
    private boolean Reservado;

    public Bloque(Date FechaHoraInicio, Date FechaHoraTermino, boolean Reservado) {
        this.FechaHoraInicio = FechaHoraInicio;
        this.FechaHoraTermino = FechaHoraTermino;
        this.Reservado = Reservado;
    }

    public Date getFechaHoraInicio() {
        return FechaHoraInicio;
    }

    public void setFechaHoraInicio(Date FechaHoraInicio) {
        this.FechaHoraInicio = FechaHoraInicio;
    }

    public Date getFechaHoraTermino() {
        return FechaHoraTermino;
    }

    public void setFechaHoraTermino(Date FechaHoraTermino) {
        this.FechaHoraTermino = FechaHoraTermino;
    }

    public boolean isReservado() {
        return Reservado;
    }

    public void setReservado(boolean Reservado) {
        this.Reservado = Reservado;
    }
    
}
