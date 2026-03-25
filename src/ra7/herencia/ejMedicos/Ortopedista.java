/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejMedicos;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Ortopedista extends Medico{
    private TipoOrtopedista tipo;
    
    //Constructor

    public Ortopedista(TipoOrtopedista tipo, String nombre) {
        super(nombre);
        this.tipo = tipo;
    }
    
    
    //Getter and Setter

    public TipoOrtopedista getTipo() {
        return tipo;
    }

    public void setTipo(TipoOrtopedista tipo) {
        this.tipo = tipo;
    }
    
    //Metodo

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
