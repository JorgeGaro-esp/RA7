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
public class Revista extends Recurso{
    private String tema;
    private int numPaginas;
    
    //Constructor

    public Revista(String tema, int numPaginas, String titulo, int id) {
        super(titulo, id);
        this.tema = tema;
        this.numPaginas = numPaginas;
    }
    
    //Getter and Setter

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tema de la revista: " + tema);
        System.out.println("Numero de paginas: " + numPaginas);
    }

    
    
    @Override
    public int calcularPrestamo() {
        return 7;
    }
    
}
