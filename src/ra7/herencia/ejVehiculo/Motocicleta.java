/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejVehiculo;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Motocicleta extends Vehiculo {

    private String tipoManillar;

    //Constructor
    public Motocicleta(String tipoManillar, String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.tipoManillar = tipoManillar;
    }

    //Getter and Setter
    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    //Metodos

    @Override
    public void mostrarInfo() {
        System.out.println("Motocicleta");
        super.mostrarInfo(); 
        System.out.println("Tipo de manillar: " + tipoManillar);
    }
    
}
