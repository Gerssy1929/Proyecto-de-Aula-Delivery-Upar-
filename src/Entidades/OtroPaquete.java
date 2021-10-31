/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author German
 */
public class OtroPaquete extends Paquete {
    
    private String descripcion;

    public OtroPaquete( double peso, long precio, String descripcion) {
        super(peso, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

    @Override
    public String getDatosPaquete() {
       return "\nDescripción: " +this.descripcion;
    }
    
    
}
