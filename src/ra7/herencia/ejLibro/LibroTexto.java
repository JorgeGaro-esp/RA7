/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejLibro;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class LibroTexto extends Libro {

    private String curso;

    //Constrcutor
    public LibroTexto(String curso, String titulo, String autor) {
        super(titulo, autor);
        this.curso = curso;
    }

    //Getter and Setter
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Metodos
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Curso: " + curso);
    }

}
