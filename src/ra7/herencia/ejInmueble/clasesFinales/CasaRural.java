/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesFinales;

import ra7.herencia.ejInmueble.clasesAbstractas.Casa;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class CasaRural extends Casa{
    private static final int VALOR = 1500000;
    private double distancia;
    private double altitud;
    
    //Constructor

    public CasaRural(double distancia, double altitud, int numPisos, int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(numPisos, numHabitaciones, numBaños, id, area, direccion);
        this.distancia = distancia;
        this.altitud = altitud;
        setValorCompra(area*VALOR);
    }
    
    //Getter and Setter

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    
    //Metodo

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caracteristicas de la casa rural");
        System.out.println("Ditancia a la cabecera municipal: " + distancia);
        System.out.println("Altitud sobre el nivel del mar: " + altitud);
        System.out.println("Valor de compra: " + getValorCompra());
    }
    
}
