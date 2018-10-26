package edu.ejemplo.kevroman.colegio3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kevin roman on 12/03/2018.
 */

public class AdapterColegio extends RecyclerView.Adapter<AdapterColegio.ViewHolder> {
    ArrayList<Colegio> listaColegio;
    ClickColegio clickColegio;

    public AdapterColegio(ArrayList<Colegio> listaColegio, ClickColegio clickColegio) {
        this.listaColegio = listaColegio;
        this.clickColegio = clickColegio;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_colegio,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Colegio colegio = listaColegio.get(position);
        holder.foto.setImageResource(colegio.getFoto());
        holder.dato.setText(colegio.getNombre());
        holder.historia.setText(colegio.getHistoria());
        holder.setOnClick(colegio,clickColegio);
    }
    public void setListaColegio(ArrayList<Colegio> colegios){
        this.listaColegio = colegios;
        notifyDataSetChanged();
    }
    public void addColegio(Colegio colegio){
        this.listaColegio.add(colegio);
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return listaColegio.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView dato;
        TextView historia;
        FrameLayout boton;
        public ViewHolder(View itemView) {
            super(itemView);
            foto = (ImageView)itemView.findViewById(R.id.imagen_colegio);
            dato = (TextView)itemView.findViewById(R.id.texto_colegio);
            historia = (TextView)itemView.findViewById(R.id.descripcion);
            boton = (FrameLayout)itemView.findViewById(R.id.framen);
        }
        public void setOnClick(final Colegio colegio,final ClickColegio clickColegio){
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickColegio.click(colegio);
                }
            });
        }

    }
}
