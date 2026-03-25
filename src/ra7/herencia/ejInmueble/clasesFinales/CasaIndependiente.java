/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesFinales;

import ra7.herencia.ejInmueble.clasesAbstractas.CasaUrbana;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class CasaIndependiente extends CasaUrbana{
    private static final int VALOR = 3000000;
    
    //Constructor

    public CasaIndependiente(int numPisos, int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(numPisos, numHabitaciones, numBaños, id, area, direccion);
        setValorCompra(area*VALOR);
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caracteristicas de la casa urbana");
        System.out.println("Tipo: conjunto cerrado");
        System.out.println("Valor de compra: " + getValorCompra());
    }
    
    
}
