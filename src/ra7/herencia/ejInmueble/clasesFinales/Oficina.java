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
public class Oficina extends Local{
    private static final int VALOR = 3500000;
    private boolean gobierno;
    
    //Constructor

    public Oficina(boolean gobierno, Localizacion localizacion, int id, int area, String direccion) {
        super(localizacion, id, area, direccion);
        this.gobierno = gobierno;
        setValorCompra(area*VALOR);
    }
    
    //Getter and Setter 

    public boolean isGobierno() {
        return gobierno;
    }

    public void setGobierno(boolean gobierno) {
        this.gobierno = gobierno;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caracteristicas de la oficina");
        if (gobierno) {
            System.out.println("Pertenece al gobierno");
        } else System.out.println("No pertenece al gobierno");
        System.out.println("Valor de compra: " + getValorCompra());
    }
    
}
