/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Entidades.*;
import Logica.*;
import datos.*;

/**
 *
 * @author German
 */
public class VistaConsola {
    
    private String opcionesMenu[] = {"1. Crear nuevo Registro de Paquete ", "2.Imprimir Registro de Entrega de Paquetes ", "3. Consultas", "4. Salir"};
    private int opcion;
    private CentralCarga Central;

    public VistaConsola() {
        this.Central = new CentralCarga();
    }

    public String[] getOpcionesMenu() {
        return opcionesMenu;
    }

    public void setOpcionesMenu(String[] opcionesMenu) {
        this.opcionesMenu = opcionesMenu;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcionSeleccionada(int opcionSeleccionada) {
        this.opcion = opcionSeleccionada;
    }

    public CentralCarga getCentral() {
        return Central;
    }

    public void setCentral(CentralCarga Central) {
        this.Central = Central;
    }

    
    public void RegistroPaquetes() {
        System.out.println("*** 1. Formato Registro de Paqueteria ***");
         Destinatario d = this.leerDatosDest();
         this.Central.registrarDestinatario(d);
         Remitente r = this.leerDatosRem();
         this.Central.registrarRemitente(r);
         Paquete p = this.leerDatosPaq();
         this.Central.registrarPaquetes(p);
         System.out.println("Formato de Ingreso de Paquete Guardado");
         System.out.println("Estado del Paquete: Ingresado");
         this.RepartoPaquete(p);
         this.EntregarPaquete(p);
      
    }
    
    
    
    public void EntregarPaquete(Paquete p){
        this.Central.EntregarPaquetes(p);
        System.out.println("El paquete se le ha asignado a un repartidor, el estado ha cambiado a Entregado");
    }
    
    public void RegistrarRepartidor(){
        System.out.println("*** Registrar Repartidores ***");
        Repartidor rep = this.LeerDatosRep();
        this.Central.registrarRepartidor(rep);
        System.out.println("Los repartidores han sido registrados con éxito!!");
    }
    
    public void RepartoPaquete(Paquete p){
        this.RegistrarRepartidor();
        this.Central.RepartirPaquetes(p);
        System.out.println("El Estado del paquete ha cambiado a Repartido"); 
    }
    
    public Repartidor LeerDatosRep(){
    Repartidor rep = null;
       int numrep = Lector.leerEntero("Cuantos Repartidores desea registrar?: ");
  
        for (int i=1; i<numrep+1; i++){
        
        long [] zonas_entrega = new long [3];
        System.out.println("");
        System.out.println("Ingrese los datos del Repartidor "+i);
        String nombre = Lector.leerString("Nombre: ");
        String apellido = Lector.leerString("Apellido: ");
        long id = Lector.leerLong("ID: ");
        String categoria = Lector.leerString("Categoría: ");
        String username = Lector.leerString("Username: ");
        String password = Lector.leerString("Password: ");
        System.out.println("Ingrese las zonas de entrega");
        zonas_entrega [0] = Lector.leerLong("Zona 1: ");
        zonas_entrega [0] = Lector.leerLong("Zona 2: ");
        zonas_entrega [0] = Lector.leerLong("Zona 3: ");
        rep = invocardatos.getDatosRep(nombre, apellido, id, categoria, username, password, zonas_entrega);
        }
        
        return rep;
        
    }
    
    public Paquete leerDatosPaq(){
        Paquete p;
        System.out.println("");
        System.out.println("Ingrese los Datos del Paquete");
        double peso = Lector.leerdecimal("Peso: ");
        long precio = Lector.leerLong("Precio: ");
        int tipo = Lector.leerEntero("Tipo de Paquete [1->Caja] [2->Sobre] [*->Otro Paquete]: ");
        switch(tipo){
            case 1: double largo = Lector.leerdecimal("Largo: ");
                    double ancho = Lector.leerdecimal("Ancho: ");
                    double alto = Lector.leerdecimal("Alto: ");
                    p = invocardatos.getDatosPaq("Caja", peso, precio, largo, ancho, alto, "");
                    break;
            case 2: 
                p = invocardatos.getDatosPaq("Sobre", peso, precio, 0, 0, 0, "");
                break;
            default: String descripcion = Lector.leerString("Descripción: ");
                p = invocardatos.getDatosPaq("Otro Paquete", peso, precio, 0, 0, 0, descripcion);
        }
        
        return p;
   
    }
   
    public Remitente leerDatosRem(){
        Remitente r;
        System.out.println("");
        System.out.println("Ingrese los Datos del Remitente");
        String nombred = Lector.leerString("Nombre: ");
        String apellidod = Lector.leerString("Apellido: ");
        long idd = Lector.leerLong("ID: ");
        String calle = Lector.leerString("Calle/Carrera: ");
        String numcasa = Lector.leerString("N° de Vivienda: ");
        String pais = Lector.leerString("País: ");
        String ciudad = Lector.leerString("Ciudad: ");
        long tel = Lector.leerLong("Teléfono: ");
        r = invocardatos.getDatosRem(nombred, apellidod, idd, calle, numcasa, pais, ciudad, tel);
        return r;
        
    }
   
    public Destinatario leerDatosDest() {
        Destinatario d;
        System.out.println("Ingrese los Datos del Destinatario");
        String nombred = Lector.leerString("Nombre: ");
        String apellidod = Lector.leerString("Apellido: ");
        long idd = Lector.leerLong("ID: ");
        String calle = Lector.leerString("Calle/Carrera: ");
        String numcasa = Lector.leerString("N° de Vivienda: ");
        long codp = Lector.leerLong("Código Postal: ");
        long tel = Lector.leerLong("Teléfono: ");
        d = invocardatos.getDatosDest(nombred, apellidod, idd, calle, numcasa, codp, tel);
        return d;
    }
   
    public void evaluarOpcionMenu(){
       
            switch(this.opcion){ 
                case 1: this.RegistroPaquetes();
                break;
                case 2: System.out.println("Lista de Paquetes Registrados");
                break;
                case 3: System.out.println("Que desea consultar?");
                break;
                case 4: System.out.println("Ha finalizado la Ejecución del aplicativo...");
                break;
                default: System.out.println("La opcion seleccionada no esta disponible, intente nuevamente");
            }
    }
    
    
    public void menuOpciones(){
        System.out.println("");
        System.out.println("~~~~~ MENU OPCIONES ~ DELIVERY UPAR ~~~~~");
        for(String item: this.opcionesMenu){ 
            System.out.println(item);
        }
        System.out.println("");
        this.opcion = Lector.leerEntero("Por favor elija una opcion: ");
        
    }
    
    public void runMenu(){
        
        do{
             this.menuOpciones();
             this.evaluarOpcionMenu();
             
        }while(this.opcion!=4);
    }
    
    
}
