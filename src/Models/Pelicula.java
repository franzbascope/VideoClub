/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author fb12263
 */
public class Pelicula {

    private String titulo;
    private String genero;
    private String director;
    private ArrayList<String> actores;
    private ArrayList<Cinta> cintas;
    private ArrayList<Socio> sociosEspera;
    
    public Pelicula(String titulo, String genero, String director, ArrayList<String> actores, ArrayList<Cinta> cintas, ArrayList<Socio> sociosEspera) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.actores = actores;
        this.cintas = cintas;
        this.sociosEspera = sociosEspera;
    }
    
    public void addCinta(Cinta cinta) {
        this.cintas.add(cinta);
    }
    
    public ArrayList<Cinta> getCintas() {
        return cintas;
    }
    
    public boolean tieneCintaDisponible() {
        for (Cinta cinta : cintas) {
            if (cinta.getEstado().equals("disponible")) {
                return true;
            }
        }
        return false;
    }
    
    public Cinta prestarCinta() throws Exception {
        for (int i = 0; i < cintas.size() - 1; i++) {
            Cinta cinta = cintas.get(i);
            if (cinta.getEstado().equals("disponible")) {
                cintas.get(i).setEstado("ocupada");
                return cinta;
            }
            
        }
        throw new Exception("No hay cintas disponibles");
    }

    public ArrayList<Socio> getSociosEspera() {
        return sociosEspera;
    }
    
    
    public void devolverCinta(Cinta cinta){
        int index = this.cintas.indexOf(cinta);
        cintas.get(index).setEstado("disponible");
    }
    
    public void agregarSocioEspera(Socio socio) {
        this.sociosEspera.add(socio);
        
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", cintas=" + cintas + '}';
    }
    
}
