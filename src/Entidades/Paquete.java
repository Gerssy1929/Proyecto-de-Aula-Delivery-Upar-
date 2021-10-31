
package Entidades;


public abstract class Paquete {

  private double peso;
  private long precio;

    public Paquete(double peso, long precio) {
        this.peso = peso;
        this.precio = precio;
        
    }
  
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

   
    
    public abstract String getDatosPaquete();

    public String DatosPaquete(){
        return this.getDatosPaquete() + "\nPeso: " + this.peso
                                      + "\nPrecio: "+ this.precio;
    }
}
