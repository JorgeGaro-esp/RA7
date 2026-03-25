/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ra7.herencia.ejMedicos;

import java.util.Vector;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalMedico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vector<Medico> medicos = new Vector<>();
        medicos.add(new Ortopedista(TipoOrtopedista.PEDIATRICA, "Luis"));
        medicos.add(new Pediatra(TipoPediatra.NEUROLOGO, "Elena"));
        medicos.add(new Pediatra(TipoPediatra.NEUROLOGO, "Juana"));
        medicos.add(new Ortopedista(TipoOrtopedista.PEDIATRICA, "Paco"));
        medicos.add(new Ortopedista(TipoOrtopedista.MAXILOFACIAL, "Alejandro"));

        int posicion = 0;
        for (Medico m : medicos) {
            if (m instanceof Ortopedista) {
                System.out.println("Ortopedista, posicion: " + posicion);
                //((Ortopedista) m).mostrarInfo();
                
            } else if (m instanceof Pediatra) {
                System.out.println("Pediatra, posicion: " + posicion);
                //((Pediatra) m).mostrarInfo();
                
            } else {
                System.out.println("Ninguno, posicion: " + posicion);
            }
            posicion++;
        }

    }

}
