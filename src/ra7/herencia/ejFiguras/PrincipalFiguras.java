/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.herencia.ejFiguras;

import ra7.herencia.ejFiguras.clasesFinales.Trapecio;
import ra7.herencia.ejFiguras.clasesAbstractas.Figura;
import ra7.herencia.ejFiguras.clasesFinales.Triangulo;
import ra7.herencia.ejFiguras.clasesFinales.Circulo;
import ra7.herencia.ejFiguras.clasesFinales.Rectangulo;
import java.util.ArrayList;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(4,"Rojo"));
        figuras.add(new Rectangulo(2,4,"Azul"));
        figuras.add(new Triangulo(1,2,3,"Amarillo"));
        figuras.add(new Trapecio(2, 4, 3, 3, 1, "Verde"));
        
        for (Figura figura : figuras) {
            figura.mostrarInfo();
            System.out.println("");
        }
    }
    
}
