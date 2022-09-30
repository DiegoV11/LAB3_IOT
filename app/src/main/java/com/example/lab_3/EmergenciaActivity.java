package com.example.lab_3;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class EmergenciaActivity extends AppCompatActivity {

    ActivityResultLauncher<String[]> requestPermissonForLocation

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencia);
        requestPermissonForLocation = registerForActivityResult(
                new ActivityResultContracts.RequestMultiplePermissions(), result -> {
                    Boolean fineLocationGranted = result.get(Manifest.permission.ACCESS_FINE_LOCATION);
                    Boolean coarseLocationGranted = result.get(Manifest.permission.ACCESS_COARSE_LOCATION);
                    if (fineLocationGranted != null && fineLocationGranted) {
                        Log.d("msg", "Permiso de ubicación precisa concedido");
                        mostrarUbicacion();
                    } else if (coarseLocationGranted != null && coarseLocationGranted) {
                        Log.d("msg", "Permiso de ubicación aproximada concedido");
                    } else {
                        Log.d("msg", "Ningun permiso concedido");
                    }
                }
        );
    }

    public void mostrarUbicacion() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            //tenemos permisos
        }else{
            //no tenemos permisos, se deben solicitar
            requestPermissonForLocation.launch(new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
            });

        }

    }

}