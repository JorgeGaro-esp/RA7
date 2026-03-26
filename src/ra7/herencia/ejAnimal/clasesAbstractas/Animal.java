/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejAnimal.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Animal {

    private String sonidos;
    private String alimentos;
    private String habitat;
    private String nombreCientifico;

    //Constructor
    public Animal(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    //Getter and Setter
    public abstract String getSonidos();

    public abstract String getAlimentos();

    public abstract String getHabitat();

    public abstract String getNombreCientifico();

    public void setSonidos(String sonidos) {
        this.sonidos = sonidos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }

    public void setHabitat(String habitat) {    
        this.habitat = habitat;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    //Metodos
    public void mostrarInfo() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Sonido: " + getSonidos());
        System.out.println("Alimento " + getAlimentos());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Nombre cientifico: " + getNombreCientifico());
    }
}
