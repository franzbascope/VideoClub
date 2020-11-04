/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author fb12263
 */
public class Cinta {
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private int numero;
    private Pelicula pelicula;

    public Cinta(String estado, int numero, Pelicula pelicula) {
        this.estado = estado;
        this.numero = numero;
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Cinta{" + "numero=" + numero + '}';
    }
    
    
    
}
