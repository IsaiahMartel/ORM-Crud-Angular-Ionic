package com.example.ormactividadactual.entity.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Localidad {
    private int idLocalidad;
    private String nombre;
    private int poblacion;

    @Id
    @Column(name = "idLocalidad")
    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "poblacion")
    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Localidad localidad = (Localidad) o;

        if (idLocalidad != localidad.idLocalidad) return false;
        if (poblacion != localidad.poblacion) return false;
        if (nombre != null ? !nombre.equals(localidad.nombre) : localidad.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLocalidad;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + poblacion;
        return result;
    }
}
