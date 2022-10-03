package com.example.lab_3.entity;

import java.io.Serializable;

public class Mascota implements Serializable {

    public String nombre;
    public String genero;
    public String nombreDueño;
    public String dniDueño;
    public String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getDniDueño() {
        return dniDueño;
    }

    public void setDniDueño(String dniDueño) {
        this.dniDueño = dniDueño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
