/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Ficha;
import Models.Pelicula;
import Models.Socio;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author fb12263
 */
public class Prestamos {

    public Prestamos() {
    }
    
    public Ficha prestarPelicula(Socio socio, Pelicula pelicula,Date fecha) throws Exception{
        if(!pelicula.tieneCintaDisponible()){
            pelicula.agregarSocioEspera(socio);
        }
        return new Ficha(socio,fecha,null,pelicula.prestarCinta(),pelicula);
    }
    
    public Ficha devolverPelicula(Ficha ficha,Date fechaDevolucion){
        ficha.getPelicula().devolverCinta(ficha.getCinta());
        ficha.setFechaDevolucion(fechaDevolucion);
        ArrayList<Socio> sociosEspera = ficha.getPelicula().getSociosEspera();
        if(sociosEspera.size() > 0){
            System.out.println("Llamar a socia en espera"+sociosEspera.get(0).toString());
        }
        return ficha;
    
    }
    
    
}
