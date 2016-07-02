/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author nicoo
 */
@Entity
@Table(name = "agenda", catalog = "ayuda_psicologica", schema = "")
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a"),
    @NamedQuery(name = "Agenda.findByAgendaid", query = "SELECT a FROM Agenda a WHERE a.agendaid = :agendaid"),
    @NamedQuery(name = "Agenda.findByProfesionalid", query = "SELECT a FROM Agenda a WHERE a.profesionalid = :profesionalid"),
    @NamedQuery(name = "Agenda.findByAgendafechainicio", query = "SELECT a FROM Agenda a WHERE a.agendafechainicio = :agendafechainicio"),
    @NamedQuery(name = "Agenda.findByAgendafechatermino", query = "SELECT a FROM Agenda a WHERE a.agendafechatermino = :agendafechatermino"),
    @NamedQuery(name = "Agenda.findByAgendahabilitada", query = "SELECT a FROM Agenda a WHERE a.agendahabilitada = :agendahabilitada")})
public class Agenda implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AGENDAID")
    private Integer agendaid;
    @Basic(optional = false)
    @Column(name = "PROFESIONALID")
    private int profesionalid;
    @Column(name = "AGENDAFECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agendafechainicio;
    @Column(name = "AGENDAFECHATERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agendafechatermino;
    @Column(name = "AGENDAHABILITADA")
    private Boolean agendahabilitada;

    public Agenda() {
    }

    public Agenda(Integer agendaid) {
        this.agendaid = agendaid;
    }

    public Agenda(Integer agendaid, int profesionalid) {
        this.agendaid = agendaid;
        this.profesionalid = profesionalid;
    }

    public Integer getAgendaid() {
        return agendaid;
    }

    public void setAgendaid(Integer agendaid) {
        Integer oldAgendaid = this.agendaid;
        this.agendaid = agendaid;
        changeSupport.firePropertyChange("agendaid", oldAgendaid, agendaid);
    }

    public int getProfesionalid() {
        return profesionalid;
    }

    public void setProfesionalid(int profesionalid) {
        int oldProfesionalid = this.profesionalid;
        this.profesionalid = profesionalid;
        changeSupport.firePropertyChange("profesionalid", oldProfesionalid, profesionalid);
    }

    public Date getAgendafechainicio() {
        return agendafechainicio;
    }

    public void setAgendafechainicio(Date agendafechainicio) {
        Date oldAgendafechainicio = this.agendafechainicio;
        this.agendafechainicio = agendafechainicio;
        changeSupport.firePropertyChange("agendafechainicio", oldAgendafechainicio, agendafechainicio);
    }

    public Date getAgendafechatermino() {
        return agendafechatermino;
    }

    public void setAgendafechatermino(Date agendafechatermino) {
        Date oldAgendafechatermino = this.agendafechatermino;
        this.agendafechatermino = agendafechatermino;
        changeSupport.firePropertyChange("agendafechatermino", oldAgendafechatermino, agendafechatermino);
    }

    public Boolean getAgendahabilitada() {
        return agendahabilitada;
    }

    public void setAgendahabilitada(Boolean agendahabilitada) {
        Boolean oldAgendahabilitada = this.agendahabilitada;
        this.agendahabilitada = agendahabilitada;
        changeSupport.firePropertyChange("agendahabilitada", oldAgendahabilitada, agendahabilitada);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agendaid != null ? agendaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.agendaid == null && other.agendaid != null) || (this.agendaid != null && !this.agendaid.equals(other.agendaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "examples.Agenda[ agendaid=" + agendaid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
