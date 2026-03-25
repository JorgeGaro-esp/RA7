/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Apartamento extends Vivienda{

    //Constructo
    public Apartamento(int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(numHabitaciones, numBaños, id, area, direccion);
    }
    
    //Metodo

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Es un apartamento");
    }
    
    
    
}
