package com.example.ormactividadactual.entity.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comunidadautonoma {
    private long idComunidad;
    private String nombre;
    private int poblacion;
    private int superficie;
    private int fkPostal;

    public Comunidadautonoma() {

    }


    @Id
    @Column(name = "idComunidad")
    public long getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(long idComunidad) {
        this.idComunidad = idComunidad;
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

    @Basic
    @Column(name = "fkPostal")
    public int getFkPostal() {
        return fkPostal;
    }

    public void setFkPostal(int fkPostal) {
        this.fkPostal = fkPostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comunidadautonoma that = (Comunidadautonoma) o;

        if (idComunidad != that.idComunidad) return false;
        if (poblacion != that.poblacion) return false;
        if (superficie != that.superficie) return false;
        if (fkPostal != that.fkPostal) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idComunidad;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + poblacion;
        result = 31 * result + superficie;
        result = 31 * result + fkPostal;
        return result;
    }

    public Comunidadautonoma(int idComunidad, String nombre, int poblacion, int superficie, int fkPostal) {
        this.idComunidad = idComunidad;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.fkPostal = fkPostal;
    }
}
