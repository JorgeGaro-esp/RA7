/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.herencia.ejLibro;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Novela n1 = new Novela(TipoNovela.AVENTURAS,"Titulo inventado","Autor inventado");
        n1.mostrarInfo();
        System.out.println("");
        LibroTextoUNC ltunc1 = new LibroTextoUNC("Facultad inventada", "Curso inventado", "Titulo inventado", "Autor inventado");
        ltunc1.mostrarInfo();
    }
    
}
