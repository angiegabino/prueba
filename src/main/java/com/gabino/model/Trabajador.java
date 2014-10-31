/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gabino.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Angie
 */
@Entity
@Table(name = "trabajador")

public class Trabajador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TRABAJADOR")
    private Integer idTrabajador;
    @Size(max = 120)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 120)
    @Column(name = "PATERNO")
    private String paterno;
    @Size(max = 120)
    @Column(name = "MATERNO")
    private String materno;

    public Trabajador() {
    }

    public Trabajador(String nombre, String paterno, String materno) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }
    

    public Trabajador(Integer idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Integer getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Integer idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajador != null ? idTrabajador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador other = (Trabajador) object;
        if ((this.idTrabajador == null && other.idTrabajador != null) || (this.idTrabajador != null && !this.idTrabajador.equals(other.idTrabajador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabino.model.Trabajador[ idTrabajador=" + idTrabajador + " ]";
    }
    
}
