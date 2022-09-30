package com.example.lab_3;

public class Mascota {
    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    private String mascota;
    private String genero;
    private String dueño;
    private int dni;
    private String descripcion;
    private String ruta;

    public Mascota(String mascota, String genero, String dueño, int dni, String descripcion, String ruta) {
        this.mascota = mascota;
        this.genero = genero;
        this.dueño = dueño;
        this.dni = dni;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }
}
