/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejMedicos;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Medico {
    private String nombre;
    
    //Constructor

    public Medico(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
    }
}
