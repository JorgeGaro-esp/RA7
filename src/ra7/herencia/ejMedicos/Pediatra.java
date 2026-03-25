/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejMedicos;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Pediatra extends Medico{
    private TipoPediatra tipo;
    
    //Constrcutor

    public Pediatra(TipoPediatra tipo, String nombre) {
        super(nombre);
        this.tipo = tipo;
    }
    
    //Getter and Setter

    public TipoPediatra getTipo() {
        return tipo;
    }

    public void setTipo(TipoPediatra tipo) {
        this.tipo = tipo;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
    
}
