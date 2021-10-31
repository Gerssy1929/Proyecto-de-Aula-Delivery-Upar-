
package Logica;

import datos.*;

import Entidades.*;
import java.util.List;


public class CentralCarga {
    
    private IRegistrable remitentes;
    private IRegistrable destinatarios;
    private IRegistrable paquetes;
    private IRegistrarRepartidor repartidores;
    private IRegistrarPaqRepartidos paquetesRepartidos;
    private IEntregable paquetesEntregados;
   
    public CentralCarga() {
        this.remitentes = new RegistroIngreso();
        this.destinatarios = new RegistroIngreso();
        this.paquetes = new RegistroIngreso();
        this.repartidores = new RegistroRepartidor();
        this.paquetesRepartidos = new RepartoPaquetes();
        this.paquetesEntregados = new ListaPaqueteRepartido();
        
    }

    public IRegistrable getRemitentes() {
        return remitentes;
    }

    public void setRemitentes(IRegistrable remitentes) {
        this.remitentes = remitentes;
    }

    public IRegistrable getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(IRegistrable destinatarios) {
        this.destinatarios = destinatarios;
    }

    public IRegistrable getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(IRegistrable paquetes) {
        this.paquetes = paquetes;
    }

    public IRegistrarRepartidor getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(IRegistrarRepartidor repartidores) {
        this.repartidores = repartidores;
    }

    public IRegistrarPaqRepartidos getPaquetesRepartidos() {
        return paquetesRepartidos;
    }

    public void setPaquetesRepartidos(IRegistrarPaqRepartidos paquetesRepartidos) {
        this.paquetesRepartidos = paquetesRepartidos;
    }

    public IEntregable getPaquetesEntregados() {
        return paquetesEntregados;
    }

    public void setPaquetesEntregados(IEntregable paquetesEntregados) {
        this.paquetesEntregados = paquetesEntregados;
    }
    
    
    
    
    
    
    public boolean registrarDestinatario(Destinatario d){
        return this.destinatarios.registrarDestinatario(d);
    }
    
    public boolean registrarRemitente(Remitente r){
        return this.remitentes.registrarRemitente(r);
    }
    
    public boolean registrarPaquetes (Paquete p){
        return this.paquetes.registrarPaquetes(p);
    }
    
    public boolean registrarRepartidor (Repartidor rep){
        return this.repartidores.RegistrarRepartidor(rep);
    }
    
    public boolean RepartirPaquetes(Paquete p){
        return this.paquetesRepartidos.RepartirPaquetes(p);
    }
    
    public boolean EntregarPaquetes(Paquete p){
        return this.paquetesEntregados.entregarPaquete(p);
    }
    
 
    
}
