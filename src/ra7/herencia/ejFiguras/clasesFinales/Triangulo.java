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
public class Triangulo extends Figura {

    private int a;
    private int b;
    private int c;
    private int altura;

    //Constructor

    public Triangulo(int a, int b, int c, int altura, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.altura = altura;
    }
    public int getA() {    
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getAltura() {
        return altura;
    }

    //Getter and Setter
    public void setAltura(int altura) {    
        this.altura = altura;
    }

    //Metodos
    @Override
    public double calcularArea() {
        
        return (c*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return (a + b + c);
    }

}
