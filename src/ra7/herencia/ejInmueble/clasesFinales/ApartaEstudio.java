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
public class ApartaEstudio extends Apartamento{
    private static final int VALOR = 1500000;
    
    //Constructor

    public ApartaEstudio(int numBaños, int id, int area, String direccion) {
        super(1, numBaños, id, area, direccion);
        setValorCompra(area*VALOR);
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Estudio");
        System.out.println("Valor de compra: " + getValorCompra());
    }
    
    
    
}
