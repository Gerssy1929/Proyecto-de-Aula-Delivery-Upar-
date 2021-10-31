/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Entidades.*;

/**
 *
 * @author German
 */
public class invocardatos {
    
    public static Destinatario getDatosDest (String nombre, String apellido, long id, String calle_carrera, String numcasa, long codpostal, long telefono){
        Destinatario d = null;
        return d;
    }
    
    public static Remitente getDatosRem (String nombre, String apellido, long id, String calle_carrera, String numcasa, String pais, String ciudad, long telefono ){
        Remitente r = null;
        return r;
    }
    
     public static Paquete getDatosPaq(String tipo, double peso, long precio, double largo, double ancho, double alto, String descripcion ) {
       
        Paquete p;
        
            switch(tipo){
                case "Caja": p = new Caja (peso, precio, largo, ancho, alto);
                break;
                case "Sobre": p = new Sobre (peso, precio);
                break;
                default: p = new OtroPaquete(peso, precio, descripcion);
            }
            return p;
    }
     
     public static Repartidor getDatosRep(String nombre, String apellido, long id, String categoria, String username, String password, long [] zonas_entrega){
         Repartidor rep = null;
         return rep;
     }
}
