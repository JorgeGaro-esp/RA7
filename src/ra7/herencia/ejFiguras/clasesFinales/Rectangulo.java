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
public class Rectangulo extends Figura{
    private int base;
    private int altura;

    //Constructor

    public Rectangulo(int base, int altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    

    //Getter and Setter

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
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
        return (base*altura);
    }

    @Override
    public double calcularPerimetro() {
        return((2*base)+(2*altura));
    }
    
    
    
}
