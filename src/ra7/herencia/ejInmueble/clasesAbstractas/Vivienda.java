/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Vivienda extends Inmueble{
    private int numHabitaciones;
    private int numBaños;
    
    //Constructor

    public Vivienda(int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(id, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }
    
    //Getter and Setter

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caracteristicas de la vivienda");
        System.out.println("Numero de habitaciones: " + numHabitaciones);
        System.out.println("Numero de baños: " + numBaños);
    }
    
}
