/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejFiguras.clasesFinales;

import ra7.herencia.ejFiguras.clasesAbstractas.Figura;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Circulo extends Figura{
    private int radio;

    //Constructor
    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    //Getter and Setter

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    //Metodos

    @Override
    public double calcularArea() {
        return (Math.PI*Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2*Math.PI*radio);
    }
    
    
}
