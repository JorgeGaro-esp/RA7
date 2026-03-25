/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejAnimal.clasesFinales;

import ra7.herencia.ejAnimal.clasesAbstractas.Canido;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Lobo extends Canido {

    //Constructor
    public Lobo(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        super(sonidos, alimentos, habitat, nombreCientifico);
    }

    //Metodos abstractos
    @Override
    public String getSonidos() {
        return "Su sonido es el aullido";
    }

    @Override
    public String getAlimentos() {
        return "Su dieta es carnivora";
    }

    @Override
    public String getHabitat() {
        return "Su habitat es el bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }

}
