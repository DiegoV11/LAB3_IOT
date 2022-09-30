package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.lab_3.entity.ListaMascotas;
import com.example.lab_3.entity.Mascota;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void crearMascota(View view){
        EditText nombreMascota = findViewById(R.id.editTextText_nombre_mascota);
        Spinner genero = findViewById(R.id.spinner_genero_mascota);
        EditText nombreDueño= findViewById(R.id.editTextText_nombre_dueño);
        EditText dniDueño = findViewById(R.id.editText_dni_dueño);
        EditText descripcion=findViewById(R.id.editTextText_descripcion_mascota);

        String nombreMascotaStr = nombreMascota.getText().toString();
        String generoStr= genero.getSelectedItem().toString();
        String nombreDueñoStr = nombreDueño.getText().toString();
        String dniDueñoStr = dniDueño.getText().toString();
        String descripcionStr = descripcion.getText().toString();



        if(nombreMascotaStr.isEmpty()|| generoStr.isEmpty() || nombreDueñoStr.isEmpty() || dniDueñoStr.isEmpty() || descripcionStr.isEmpty() ){
            Toast.makeText(this, "Completar todos los campos", Toast.LENGTH_SHORT).show();
        }else {

            Mascota mascota = new Mascota();
            mascota.setNombre(nombreMascotaStr);
            mascota.setGenero(generoStr);
            mascota.setNombreDueño(nombreDueñoStr);
            mascota.setDniDueño(dniDueñoStr);
            mascota.setDescripcion(descripcionStr);


            ListaMascotas.añadirMascota(mascota);

            Intent intent = new Intent(Registro.this, MainActivity.class);
            startActivityForResult(intent, 1);
        }


    }



}