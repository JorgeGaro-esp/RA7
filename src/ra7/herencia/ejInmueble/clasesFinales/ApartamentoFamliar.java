/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesFinales;

import ra7.herencia.ejInmueble.clasesAbstractas.Apartamento;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class ApartamentoFamliar extends Apartamento {
    public static final int VALOR = 2000000;
    
    //Constructor

    public ApartamentoFamliar(int numHabitaciones, int numBaños, int id, int area, String direccion) {
        super(numHabitaciones, numBaños, id, area, direccion);
        setValorCompra(area*VALOR);
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Familiar");
        System.out.println("Valor de compra: " + getValorCompra());
    }
    
}
