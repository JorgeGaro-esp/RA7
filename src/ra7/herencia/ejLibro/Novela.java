/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejLibro;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Novela extends Libro{
    public TipoNovela tipo;
    
    //Constructor

    public Novela(TipoNovela tipo, String titulo, String autor) {
        super(titulo, autor);
        this.tipo = tipo;
    }
    
    //Getter and Setter

    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }
    
    //Metodos

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de novela: " + tipo);
    }
    
}
