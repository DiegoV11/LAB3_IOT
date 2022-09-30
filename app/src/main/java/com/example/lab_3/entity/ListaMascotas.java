package com.example.lab_3.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaMascotas{

    public static ArrayList<Mascota> listaMascotas = new ArrayList<>();

    public static ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public static void añadirMascota(Mascota mascota) {
        listaMascotas.add(mascota);
    }
}
