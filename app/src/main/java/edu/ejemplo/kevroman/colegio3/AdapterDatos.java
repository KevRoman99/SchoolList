package edu.ejemplo.kevroman.colegio3;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by kevin roman on 11/03/2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolder> {

    ArrayList<Categorias> listaCateogiras;
    Clilkcled clilkcled;

    public AdapterDatos(ArrayList<Categorias> listaCateogiras, Clilkcled clilkcled) {
        this.listaCateogiras = listaCateogiras;
        this.clilkcled = clilkcled;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.roow,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Categorias categorias = listaCateogiras.get(position);
       holder.dato.setText(categorias.getNombre());
       holder.foto.setImageResource(categorias.getFoto());
       holder.setOnClick(categorias ,clilkcled);
    }
    public void setListaCateogiras(ArrayList<Categorias> categorias){
        this.listaCateogiras = categorias;
        notifyDataSetChanged();
    }
    public void addCategorias(Categorias  categorias){
        this.listaCateogiras.add(categorias);
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return listaCateogiras.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView dato;
        CircleImageView foto;
        CardView container;
        public ViewHolder(View itemView) {
            super(itemView);
            dato = (TextView) itemView.findViewById(R.id.texto);
            foto = (CircleImageView)itemView.findViewById(R.id.imagen);
            container = (CardView)itemView.findViewById(R.id.container);
        }
        public void setOnClick(final Categorias categorias,final Clilkcled clilkcled){
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clilkcled.click(categorias);
                }
            });
        }

    }
}
