/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.herencia.ejAnimal;

import java.util.ArrayList;
import java.util.Vector;
import ra7.herencia.ejAnimal.clasesAbstractas.Animal;
import ra7.herencia.ejAnimal.clasesFinales.Gato;
import ra7.herencia.ejAnimal.clasesFinales.Leon;
import ra7.herencia.ejAnimal.clasesFinales.Lobo;
import ra7.herencia.ejAnimal.clasesFinales.Perro;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Gato("","","",""));
        animales.add(new Lobo("","","",""));
        animales.add(new Leon("","","",""));
        animales.add(new Perro("","","",""));
        
        for (Animal animal:animales) {
            animal.mostrarInfo();
            System.out.println("");
        }
    }
    
}
