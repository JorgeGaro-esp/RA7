/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesAbstractas;

import ra7.herencia.ejInmueble.Localizacion;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Local extends Inmueble{
    private Localizacion localizacion;
    
    //Constructor

    public Local(Localizacion localizacion, int id, int area, String direccion) {
        super(id, area, direccion);
        this.localizacion = localizacion;
    }
    
    //Getter and Setter

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Caracteristicas del local");
        System.out.println("Localizacion " + localizacion);
    }
    
}
