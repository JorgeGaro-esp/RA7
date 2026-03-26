/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejBiblioteca.recursos;

import ra7.herencia.ejBiblioteca.base.Recurso;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Video extends Recurso {
    private int duracion;
    
    //Constructor

    public Video(int duracion, String titulo, int id) {
        super(titulo, id);
        this.duracion = duracion;
    }
    
    //Getter and Setter

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Duracion del video (minutos): " + duracion);
    }

    
    
    @Override
    public int calcularPrestamo() {
        return 3;
    }
    
}
