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

    //Constructor
    public Triangulo(int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getter and Setter
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

    //Metodos
    @Override
    public double calcularArea() {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        return (a + b + c);
    }

}
