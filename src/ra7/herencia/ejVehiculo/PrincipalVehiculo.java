/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.herencia.ejVehiculo;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche c1=new Coche(4,"Toyota","Corolla",2020);
        c1.mostrarInfo();
        System.out.println("");
        Motocicleta m1=new Motocicleta("Deportivo","Yamaha","MT-07",2023);
        m1.mostrarInfo();
    }
    
}
