/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author fb12263
 */
public class Ficha {
    private Socio socio;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Cinta cinta;
    private Pelicula pelicula;

    public Ficha(Socio socio, Date fechaPrestamo, Date fechaDevolucion, Cinta cinta,Pelicula pelicula) {
        this.socio = socio;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.cinta = cinta;
        this.pelicula = pelicula;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Ficha{" + "socio=" + socio + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", cinta=" + cinta + ", pelicula=" + pelicula + '}';
    }
    
    
    
    
}
