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
public class CasaCerrada extends CasaUrbana{
    private static final int VALOR = 2500000;
    private boolean areasComunes;
    
    //Constructor

    public CasaCerrada(boolean areasComunes, int numPisos, int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(numPisos, numHabitaciones, numBaños, id, area, direccion);
        this.areasComunes = areasComunes;
        setValorCompra(area*VALOR);
    }
    
    //Getter and Setter

    public boolean isAreasComunes() {
        return areasComunes;
    }

    public void setAreasComunes(boolean areasComunes) {
        this.areasComunes = areasComunes;
    }

    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caracteristicas de la casa urbana");
        System.out.println("Tipo: conjunto cerrado");
        if (areasComunes) {
            System.out.println("Tiene areas comunes: Si ");
        } else System.out.println("Tiene areas comunes: No ");
        System.out.println("Valor de compra: " + getValorCompra());
    }
    
}
