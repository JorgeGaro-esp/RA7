/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ra7.herencia.ejInmueble.clasesAbstractas;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public abstract class Inmueble {
    
    private int id;
    private int area;
    private String direccion;
    private int valorCompra;

    //Constructor
    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
        
        
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
    
    //Metodos
    public void mostrarInfo() {
        System.out.println("Caracteristicas del inmueble");
        System.out.println("Id: " + id);
        System.out.println("Area: " + area);
        System.out.println("Direccion: " + direccion);
    }
}
