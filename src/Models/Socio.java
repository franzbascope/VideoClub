/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author fb12263
 */
public class Socio {
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<String> actoresFavoritos;
    private ArrayList<String> directoresFavoritos;
    private ArrayList<String> generosFavoritos;

    public Socio(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public ArrayList<String> getActoresFavoritos() {
        return actoresFavoritos;
    }

    public void setActoresFavoritos(ArrayList<String> actoresFavoritos) {
        this.actoresFavoritos = actoresFavoritos;
    }

    public ArrayList<String> getDirectoresFavoritos() {
        return directoresFavoritos;
    }

    public void setDirectoresFavoritos(ArrayList<String> directoresFavoritos) {
        this.directoresFavoritos = directoresFavoritos;
    }

    public ArrayList<String> getGenerosFavoritos() {
        return generosFavoritos;
    }

    public void setGenerosFavoritos(ArrayList<String> generosFavoritos) {
        this.generosFavoritos = generosFavoritos;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", directoresFavoritos=" + directoresFavoritos + '}';
    }
    
    
    
    
    
    
    
    
}
