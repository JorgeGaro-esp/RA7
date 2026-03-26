/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejFiguras.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    //Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Metodos
    public void mostrarColor() {
        System.out.println("El color del " + this.getClass().getSimpleName() + " es: " + color);
    }

    public void mostrarInfo() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        mostrarColor();
        System.out.println("¿La figura es grande? (>50): " + esGrande());
    }

    public boolean esGrande() {
        if (calcularArea() > 50) {
            return true;
        } else {
            return false;
        }
    }

    public void esMayor(Figura f) {
        if (this.calcularArea() > f.calcularArea()) {
            System.out.println("El " + this.getClass().getSimpleName());
        }
        if (f.calcularArea() > this.calcularArea()) {
            System.out.println("El " + f.getClass().getSimpleName());
        } else {
            System.out.println("Son iguales");
        }
    }

    //Abstracto
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

}
