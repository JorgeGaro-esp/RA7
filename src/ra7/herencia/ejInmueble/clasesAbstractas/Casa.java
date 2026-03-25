/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Casa extends Vivienda{
    private int numPisos;
    
    //Constructor

    public Casa(int numPisos, int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(numHabitaciones, numBaños, id, area, direccion);
        this.numPisos = numPisos;
    }
    
    //Getter and Setter

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caracteristicas de la casa");
        System.out.println("Numero de pisos: " + numPisos);
    }
    
}
