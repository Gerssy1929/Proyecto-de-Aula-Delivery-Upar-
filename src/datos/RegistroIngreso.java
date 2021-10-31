
package datos;

import datos.IRegistrable;
import Entidades.Destinatario;
import Entidades.Paquete;
import Entidades.Persona;
import Entidades.Remitente;
import java.util.*;



public class RegistroIngreso implements IRegistrable{
    
    private List listaRemitentes;
    private List listaDestinatarios;
    private List listaPaquetes;

    public RegistroIngreso() {
        this.listaRemitentes = new ArrayList();
        this.listaDestinatarios = new ArrayList();
        this.listaPaquetes = new ArrayList();
    }
   

    public List getListaRemitentes() {
        return listaRemitentes;
    }

    public void setListaRemitentes(List listaRemitentes) {
        this.listaRemitentes = listaRemitentes;
    }

    public List getListaDestinatarios() {
        return listaDestinatarios;
    }

    public void setListaDestinatarios(List listaDestinatarios) {
        this.listaDestinatarios = listaDestinatarios;
    }
    
    

    public List getListaPaquetes() {
        return listaPaquetes;
    }

    public void setListaPaquetes(List listaPaquetes) {
        this.listaPaquetes = listaPaquetes;
    }
     
    
    @Override
    public boolean registrarDestinatario(Destinatario d) {
       return this.listaDestinatarios.add(d);
    }

    @Override
    public boolean registrarRemitente(Remitente r) {
        return this.listaRemitentes.add(r);
    }

    
    @Override
    public boolean registrarPaquetes(Paquete p) {
        return this.listaPaquetes.add(p);
    }
    
    

    @Override
    public int getTotalregistros() {
        return this.listaPaquetes.size();
    }
    
}
