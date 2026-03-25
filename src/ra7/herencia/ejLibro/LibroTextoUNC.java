/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejLibro;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class LibroTextoUNC extends LibroTexto {

    private String facultad;

    //Constructor
    public LibroTextoUNC(String facultad, String curso, String titulo, String autor) {
        super(curso, titulo, autor);
        this.facultad = facultad;
    }

    //Getter and Setter
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    //Metodos
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Facultad: " + facultad);
    }

}
