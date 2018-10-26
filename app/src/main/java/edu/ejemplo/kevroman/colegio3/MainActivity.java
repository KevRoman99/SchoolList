package edu.ejemplo.kevroman.colegio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Clilkcled {
    ArrayList<Categorias> listaDatos;
    RecyclerView recyclerView;
    AdapterDatos adapterDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView = (RecyclerView)findViewById(R.id.recycler);
         recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL,false));
         adapterDatos = new AdapterDatos(new ArrayList<Categorias>(),this);

        recyclerView.setAdapter(adapterDatos);
        AgregarCategorias();
    }
    private void AgregarCategorias() {
        adapterDatos.addCategorias(new Categorias("Colegios para Señoritas",R.drawable.mujer));
        adapterDatos.addCategorias(new Categorias("Colegios para Varones",R.drawable.varon));
        adapterDatos.addCategorias(new Categorias("Colegios Mixtos",R.drawable.mixto));
        adapterDatos.addCategorias(new Categorias("Colegios Técnicos",R.drawable.tecnico));
        adapterDatos.addCategorias(new Categorias("Colegios Bilingües",R.drawable.idioa));
    }
    @Override
    public void click(Categorias categorias) {
        try {
            startActivity(new Intent(this,ColegiosActivity.class)
                .putExtra("Categoria",ObjectSerializer.serialize(categorias)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
