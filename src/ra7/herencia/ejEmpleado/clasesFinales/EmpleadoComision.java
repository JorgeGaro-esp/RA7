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
public class EmpleadoComision extends Empleado {
    private double comision;

    //Constructor
    public EmpleadoComision(double comision, String nombre, int id, double salarioBase) {
        super(nombre, id, salarioBase);
        this.comision = comision;
    }
    
    //Getter and Setter

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    //Metodos

    @Override
    public double calcularSalario() {
        return getSalarioBase()+comision;
    }
    
    
    
}
