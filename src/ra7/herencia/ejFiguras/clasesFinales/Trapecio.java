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
public class Trapecio extends Figura {

    private int base1;
    private int base2;
    private int lado1;
    private int lado2;
    private int altura;

    //Constructor
    public Trapecio(int base1, int base2, int lado1, int lado2, int altura, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    //Getter and Setter
    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Metodos
    @Override
    public double calcularArea() {
        return (base1*base2*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return (base1+base2+lado1+lado2);
    }

}
