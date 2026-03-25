/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejAnimal.clasesFinales;

import ra7.herencia.ejAnimal.clasesAbstractas.Felino;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Leon extends Felino {

    //Constructor
    public Leon(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        super(sonidos, alimentos, habitat, nombreCientifico);
    }

    //Metodos abstractos
    @Override
    public String getSonidos() {
        return "Su sonido es el rugido";
    }

    @Override
    public String getAlimentos() {
        return "Su dieta es carnivora";
    }

    @Override
    public String getHabitat() {
        return "Su habitat es la sabana";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }

}
