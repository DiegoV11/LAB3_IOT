package com.example.lab_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HistorialAdapter extends RecyclerView.Adapter<HistorialAdapter.MascotaViewHolder> {

    private Mascota[] listaMascota;
    private Context context;

    // clase interna que manejara cada elemento
    class MascotaViewHolder extends RecyclerView.ViewHolder{

        Mascota mascota;

        public MascotaViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemVew = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new MascotaViewHolder(itemVew);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {
        Mascota mascota = listaMascota[position];
        holder.mascota = mascota;

        TextView tvMascota = holder.itemView.findViewById(R.id.textViewMascota);
        tvMascota.setText(mascota.getMascota());

        TextView tvGenero = holder.itemView.findViewById(R.id.textViewGenero);
        tvGenero.setText(mascota.getGenero());

        TextView tvDueño = holder.itemView.findViewById(R.id.textViewDueño);
        tvDueño.setText(mascota.getDueño());

        TextView tvDni = holder.itemView.findViewById(R.id.textViewDni);
        tvDni.setText(String.valueOf(mascota.getDni()));

        TextView tvDescription = holder.itemView.findViewById(R.id.textViewDescripcion);
        tvDescription.setText(mascota.getDescripcion());

        TextView tvRuta = holder.itemView.findViewById(R.id.textViewRuta);
        tvRuta.setText(mascota.getRuta());
    }

    @Override
    public int getItemCount() {
        return listaMascota.length;
    }

    public Mascota[] getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(Mascota[] listaMascota) {
        this.listaMascota = listaMascota;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
