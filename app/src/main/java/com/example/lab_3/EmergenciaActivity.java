package com.example.lab_3;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class EmergenciaActivity extends AppCompatActivity {

    ActivityResultLauncher<String[]> requestPermissonForLocation;
    String apiKey="AIzaSyBrOhsgBaVz5JA34sWBKc1uEw4c80IUXg8";

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
                    }                }
        );

        ConnectivityManager connMgr =(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean isConnected = false;

        for (Network network : connMgr.getAllNetworks()){
            NetworkInfo networkInfo = connMgr.getNetworkInfo(network);
            if(networkInfo.isConnected()){
                isConnected=true;
            }
        }



        if(isConnected){
            RequestQueue requestQueue = Volley.newRequestQueue(this);

            String urlBase="https://maps.googleapis.com/maps/api/directions/json?";
            String destination = "destination=-12.018455013033748,%20-77.07418594311918";
            String origin = "&origin=-12.069371120633317,%20-77.08219146486309";
            String key = "&key="+apiKey;








        }
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