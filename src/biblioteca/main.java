/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import Controller.Prestamos;
import Models.Cinta;
import Models.Ficha;
import Models.Pelicula;
import Models.Socio;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fb12263
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Prestamos controller = new Prestamos();

        // Crear pelicula
        Pelicula toyStory = new Pelicula("Toy Story", "comedia", "Lasseter", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        // Crear cintas
        Cinta copia1 = new Cinta("disponible", 1, toyStory);
        Cinta copia2 = new Cinta("ocupada", 1, toyStory);
        toyStory.addCinta(copia1);
        toyStory.addCinta(copia2);
        //Crear socio
        Socio franz = new Socio("Franz", "SCZ", "72667847");

        Ficha ficha1 = null;
        try {
            ficha1 = controller.prestarPelicula(franz, toyStory, new Date());
            System.out.println(ficha1);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        Ficha ficha2;
        try {
            ficha2 = controller.prestarPelicula(franz, toyStory, new Date());
            System.out.println(ficha2);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        Ficha devolverPelicula = controller.devolverPelicula(ficha1, new Date());
        System.out.println(devolverPelicula);

    }

}
