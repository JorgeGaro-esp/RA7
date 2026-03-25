/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesFinales;

import ra7.herencia.ejInmueble.clasesAbstractas.Local;
import ra7.herencia.ejInmueble.Localizacion;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class LocalComercial extends Local {
    private static final int VALOR = 3000000;
    private String centroComercial;
    
    //Constructor

    public LocalComercial(String centroComercial, Localizacion localizacion, int id, int area, String direccion) {
        super(localizacion, id, area, direccion);
        this.centroComercial = centroComercial;
        setValorCompra(area*VALOR);
    }
    
    //Getter and Setter

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caracteristicas del local comercial");
        System.out.println("Centro comercial: " + centroComercial);
        System.out.println("Valor de compra: " + getValorCompra());
    }
    
}
