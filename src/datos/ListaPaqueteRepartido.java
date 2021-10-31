/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.Paquete;
import java.util.*;

/**
 *
 * @author German
 */
public class ListaPaqueteRepartido implements IEntregable {
    
    private List listaPaqEntregados;

    public ListaPaqueteRepartido() {
        this.listaPaqEntregados = new ArrayList();
    }

    public List getListaPaqEntregados() {
        return listaPaqEntregados;
    }

    public void setListaPaqEntregados(List listaPaqEntregados) {
        this.listaPaqEntregados = listaPaqEntregados;
    }
    
    

    @Override
    public boolean entregarPaquete(Paquete p) {
        
        return this.listaPaqEntregados.add(p);
        
    }
    
    
}
