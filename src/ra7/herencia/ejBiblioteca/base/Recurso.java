/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejBiblioteca.base;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Recurso {

    protected String titulo;
    protected int id;

    //Constructor
    public Recurso(String titulo, int id) {
        this.titulo = titulo;
        this.id = id;
    }

    //Getter and Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Metodos
    public void mostrarInfo() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
    }

    //Abstracto
    public abstract int calcularPrestamo();
}
