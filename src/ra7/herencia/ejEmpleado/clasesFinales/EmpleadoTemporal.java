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
public class EmpleadoTemporal extends Empleado {

    //Constructor
    public EmpleadoTemporal(String nombre, int id, double salarioBase) {
        super(nombre, id, salarioBase);
    }
    
    //Metodos

    @Override
    public double calcularSalario() {
        return (getSalarioBase()*0.9);
    }
    
    
    
}
