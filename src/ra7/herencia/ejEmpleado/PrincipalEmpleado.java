/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.herencia.ejEmpleado;

import ra7.herencia.ejEmpleado.clasesAbstractas.Empleado;
import ra7.herencia.ejEmpleado.clasesFinales.EmpleadoComision;
import ra7.herencia.ejEmpleado.clasesFinales.EmpleadoPorHoras;
import ra7.herencia.ejEmpleado.clasesFinales.EmpleadoTemporal;
import ra7.herencia.ejEmpleado.clasesFinales.EmpleadoFijo;
import java.util.ArrayList;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoFijo("Luis",1,1800));
        empleados.add(new EmpleadoPorHoras(2,120,"Maria",2,1550));
        empleados.add(new EmpleadoComision(40,"Alejandro",3,1200));
        empleados.add(new EmpleadoTemporal("Fatma",4,2100));
        
        for (Empleado empleado : empleados) {
            empleado.mostrarDatos();
            System.out.println("");
        }
    }
    
}
