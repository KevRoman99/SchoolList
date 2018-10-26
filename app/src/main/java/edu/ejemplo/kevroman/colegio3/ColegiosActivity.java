package edu.ejemplo.kevroman.colegio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.io.IOException;
import java.util.ArrayList;

public class ColegiosActivity extends AppCompatActivity implements Clilkcled{
    private RecyclerView recyclerView;
    private AdapterDatos adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colegios);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerColegio);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL,false));
        adapter = new AdapterDatos(new ArrayList<Categorias>(),this);
        recyclerView.setAdapter(adapter);
        recibirdatos();
    }
    public void recibirdatos(){
        try {
            Categorias categorias = (Categorias) ObjectSerializer.deserialize(getIntent().getStringExtra("Categoria"));
            Log.d("recibirDatos", categorias.getNombre());
            Colegios(categorias);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Colegios(Categorias categorias){
        switch (categorias.getNombre()){
            case "Colegios para Señoritas":
                adapter.addCategorias(new Categorias("Santa Teresita",R.drawable.santa_teresita));
                adapter.addCategorias(new Categorias("Belga",R.drawable.belga));
                adapter.addCategorias(new Categorias("Junkabal",R.drawable.jumkabal));
                adapter.addCategorias(new Categorias("Bethania",R.drawable.bethania));
                adapter.addCategorias(new Categorias("Casa Central",R.drawable.casa_central));
                adapter.addCategorias(new Categorias("El Rosario",R.drawable.rosario));
                adapter.addCategorias(new Categorias("Maria Auxiliadora",R.drawable.maria_auxiliadora));
                adapter.addCategorias(new Categorias("La Asunción",R.drawable.la_asuncion));
                adapter.addCategorias(new Categorias("Monte Maria",R.drawable.monte_maria));
                adapter.addCategorias(new Categorias("Campo Alegre",R.drawable.campo_alegre));
                adapter.addCategorias(new Categorias("Santa Inés",R.drawable.santa_teresita));


                break;
            case "Colegios para Varones":
                adapter.addCategorias(new Categorias("Don Bosco",R.drawable.don_bosco));
                adapter.addCategorias(new Categorias("San Sebastian",R.drawable.san_sebastian));
                adapter.addCategorias(new Categorias("San Jose de los Infantes",R.drawable.infantes));
                adapter.addCategorias(new Categorias("San Pablo",R.drawable.san_pablo));
                adapter.addCategorias(new Categorias("Fundacion Kinal",R.drawable.kinal));
                adapter.addCategorias(new Categorias("Robel",R.drawable.roble));

                break;
            case  "Colegios Mixtos":
                adapter.addCategorias(new Categorias("AmeriTec",R.drawable.ameritec));
                adapter.addCategorias(new Categorias("Rafael Landivar",R.drawable.rafael_landivar));
                adapter.addCategorias(new Categorias("Liceo Guatemala",R.drawable.liceo_guatemala));
                adapter.addCategorias(new Categorias("Imbpc",R.drawable.imbpc));
                adapter.addCategorias(new Categorias("IGA",R.drawable.iga));
                adapter.addCategorias(new Categorias("América Latina",R.drawable.america_latina));
                adapter.addCategorias(new Categorias("Escuela de Comercio",R.drawable.comercip));
                adapter.addCategorias(new Categorias("Campo Verde",R.drawable.campo_alegrev));
                adapter.addCategorias(new Categorias("Monte Carmelo",R.drawable.monte_carmelo));
                adapter.addCategorias(new Categorias("Liceo Javier",R.drawable.liceo_javier));
            break;
            case "Colegios Técnicos":
                adapter.addCategorias(new Categorias("Fundacion Kinal",R.drawable.kinal));
                adapter.addCategorias(new Categorias("Federico Taylor",R.drawable.federico));
                adapter.addCategorias(new Categorias("Fishman",R.drawable.fishman));
                adapter.addCategorias(new Categorias("Canadiense",R.drawable.canadiense));
                adapter.addCategorias(new Categorias("Emiliani",R.drawable.emiliani));
                break;
            case "Colegios Bilingües":
                adapter.addCategorias(new Categorias("IGA",R.drawable.iga));
                adapter.addCategorias(new Categorias("SEK",R.drawable.sek));
                adapter.addCategorias(new Categorias("EAS",R.drawable.eas));
                adapter.addCategorias(new Categorias("Roble",R.drawable.roble));
                adapter.addCategorias(new Categorias("La Colina",R.drawable.la_colina));
                adapter.addCategorias(new Categorias("AmeriTec",R.drawable.ameritec));
                adapter.addCategorias(new Categorias("Las Charcas",R.drawable.las_charcas));
                break;
        }
    }
    @Override
    public void click(Categorias categorias) {
        try {
            startActivity(new Intent(this,ResultadoColegioActivity.class)
                    .putExtra("Colegio",ObjectSerializer.serialize(categorias)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
