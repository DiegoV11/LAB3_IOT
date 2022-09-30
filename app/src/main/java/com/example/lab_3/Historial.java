package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Historial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        // data ejemplo
        Mascota guauguau = new Mascota("hiro inquilino", "m", "hiro", 80808989, "ez lab", "pucp - bati");
        Mascota michi = new Mascota("michi", "m", "hiro", 80808989, "ez lab", "pucp - bati");
        Mascota[] listaMascota = {guauguau, michi};

        HistorialAdapter adapter = new HistorialAdapter();
        adapter.setListaMascota(listaMascota);
        adapter.setContext(Historial.this);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Historial.this));
    }
}