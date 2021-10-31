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
public class Sobre extends Paquete {
    
    
    public Sobre(double peso, long precio) {
        super(peso, precio);
    }

    @Override
    public String getDatosPaquete() {
       return "";
    }
    
}
