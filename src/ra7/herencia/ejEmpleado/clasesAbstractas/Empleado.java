/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejEmpleado.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Empleado {

    private String nombre;
    private int id;
    private double salarioBase;

    //Constructor
    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Metodos
    public void mostrarDatos() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Salario final: " + calcularSalario());

    }
    //Abstractos
    public abstract double calcularSalario();
}
