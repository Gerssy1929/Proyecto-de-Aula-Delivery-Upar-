
package datos;

import datos.IRegistrarPaqRepartidos;
import Entidades.*;
import java.util.*;


public class RepartoPaquetes implements IRegistrarPaqRepartidos{
    
    private List paquetesRepartidos;
    


    public RepartoPaquetes() {
        this.paquetesRepartidos = new ArrayList();
    }

    public List getPaquetesRepartidos() {
        return paquetesRepartidos;
    }

    public void setPaquetesRepartidos(List paquetesRepartidos) {
        this.paquetesRepartidos = paquetesRepartidos;
    }

    
  
    @Override
    public boolean RepartirPaquetes(Paquete p) {
        return this.paquetesRepartidos.add(p);
    }
    
    

   
}
