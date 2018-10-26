package edu.ejemplo.kevroman.colegio3;

import java.io.Serializable;

/**
 * Created by kevin roman on 11/03/2018.
 */

public class Categorias implements Serializable {

    private String nombre;
    private int foto;
    public Categorias(){

    }

    public Categorias(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

