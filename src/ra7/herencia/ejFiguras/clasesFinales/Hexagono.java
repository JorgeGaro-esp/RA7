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
public class Hexagono extends Figura {
    private int lado;
    
    //Constructor

    public Hexagono(int lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    //Getter and Setter

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    //Metodos

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return (6*lado);
    }
    
    
}
