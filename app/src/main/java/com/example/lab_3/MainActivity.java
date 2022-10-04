package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irRegistro(View view){
        Intent intent = new Intent(MainActivity.this, Registro.class);
        startActivityForResult(intent, 1);
    }

    public void irHistorial(View view){
        Intent intent = new Intent(MainActivity.this, Historial.class);
        startActivityForResult(intent, 1);
    }



    public void irEmergencia(View view){
        Intent intent = new Intent(MainActivity.this,EmergenciaActivity.class);
        startActivity(intent);
    }


}