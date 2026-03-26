/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.herencia.ejBiblioteca.app;

import java.util.ArrayList;
import ra7.herencia.ejBiblioteca.base.Recurso;
import ra7.herencia.ejBiblioteca.recursos.Revista;
import ra7.herencia.ejBiblioteca.recursos.Libro;
import ra7.herencia.ejBiblioteca.recursos.Video;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Recurso> recursos = new ArrayList<>();
        recursos.add(new Libro(true, 37, "El principito", 1));
        recursos.add(new Revista("Musica", 20, "RockPop", 2));
        recursos.add(new Video(120, "El Amazonas", 3));
        
        for (Recurso recurso : recursos) {
            recurso.mostrarInfo();
            System.out.println("");
        }
    }

}
