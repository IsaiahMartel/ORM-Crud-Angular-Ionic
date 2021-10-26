package com.example.ormactividadactual.entity.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Provincia {
    private int codPostal;
    private String nombre;
    private int poblacion;
    private int superficie;

    @Id
    @Column(name = "codPostal")
    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
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

    @Basic
    @Column(name = "superficie")
    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provincia provincia = (Provincia) o;

        if (codPostal != provincia.codPostal) return false;
        if (poblacion != provincia.poblacion) return false;
        if (superficie != provincia.superficie) return false;
        if (nombre != null ? !nombre.equals(provincia.nombre) : provincia.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codPostal;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + poblacion;
        result = 31 * result + superficie;
        return result;
    }
}
