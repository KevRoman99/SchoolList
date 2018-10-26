package edu.ejemplo.kevroman.colegio3;

import java.io.Serializable;

/**
 * Created by kevin roman on 12/03/2018.
 */

public class Colegio implements Serializable {
    private int foto;
    private String nombre;
    private String historia;

    public Colegio(){

    }

    public Colegio(int foto, String nombre, String historia) {
        this.foto = foto;
        this.nombre = nombre;
        this.historia = historia;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
