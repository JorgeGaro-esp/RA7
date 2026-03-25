/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejVehiculo;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Coche extends Vehiculo{
    private int numPuertas;
    
    //Constructor

    public Coche(int numPuertas, String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }
    
    //Getter and Setter

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        System.out.println("Coche: ");
        super.mostrarInfo(); 
        System.out.println("Numero de puertas: " + numPuertas);
    }
    
}
