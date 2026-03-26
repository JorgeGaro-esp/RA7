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
public class Libro extends Recurso{
    private boolean tapaDura;
    private int numPaginas;
    
    //Constructor

    public Libro(boolean tapaDura, int numPaginas, String titulo, int id) {
        super(titulo, id);
        this.tapaDura = tapaDura;
        this.numPaginas = numPaginas;
    }
    
    //Getter and Setter

    public boolean isTapaDura() {
        return tapaDura;
    }

    public void setTapaDura(boolean tapaDura) {
        this.tapaDura = tapaDura;
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
        System.out.println("¿El libro es de tapa dura?: " +tapaDura);
        System.out.println("Numero de paginas: " + numPaginas);
    }

    
    
    @Override
    public int calcularPrestamo() {
        return 15;
    }
    
}
