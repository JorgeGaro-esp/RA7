/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejEmpleado.clasesFinales;

import ra7.herencia.ejEmpleado.clasesAbstractas.Empleado;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double pagoPorHora;

    //Constructor
    public EmpleadoPorHoras(int horasTrabajadas, double pagoPorHora, String nombre, int id, double salarioBase) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    //Getter and Setter
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    //Metodos
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasTrabajadas * pagoPorHora);
    }

}
