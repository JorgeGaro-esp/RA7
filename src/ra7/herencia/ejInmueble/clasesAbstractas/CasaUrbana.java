/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class CasaUrbana extends Casa{

    public CasaUrbana(int numPisos, int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(numPisos, numHabitaciones, numBaños, id, area, direccion);
    }
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
    
    
}
