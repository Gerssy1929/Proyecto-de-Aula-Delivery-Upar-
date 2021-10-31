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
public class Caja extends Paquete {
    private double largo;
    private double ancho;
    private double alto;

    public Caja(double peso, long precio, double largo, double ancho, double alto) {
        super(peso, precio);
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String getDatosPaquete() {
        return "\nLargo: " + this.largo
               + "\nAncho: " + this.ancho
               + "\nAlto: " + this.alto;
    }
    
    
    
    
}
