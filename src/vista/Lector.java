/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class Lector {
    private static Scanner lector = new Scanner(System.in);
    
    public static int leerEntero(String read){
        int var=0;
        boolean error;
        do{
            try{
                System.out.print(read);
                var = lector.nextInt();
                error = false;
                return var;
            }
            catch(InputMismatchException ime){
                System.out.println("Error de lectura: se requiere un valor entero" );
                lector.nextLine();
                error = true;
            }
        }while(error);    
        return var;
    }
    
    
    public static long leerLong(String read){
        long var=0;
        boolean error;
        do{
            try{
                System.out.print(read);
                var = lector.nextLong();
                error = false;
                return var;
            }
            catch(InputMismatchException ime){
                System.out.println("Error de lectura: se requiere un valor entero" );
                lector.nextLine();
                error = true;
            }
        }while(error);    
        return var;
    }
    
    
    public static double leerdecimal(String read){
        double var1=0;
        boolean error;
        
        do{
            try{
                System.out.println(read);
                var1 = lector.nextDouble();
                error = false;
                return var1;
            }
            catch (InputMismatchException ime){
                System.out.println("Error de lectura, ingrese un valor entero o decimal");
                lector.nextLine();
                error=true;
            }
        } while (error);
        return var1;
    }
    
    public static String leerString(String read){
        System.out.print(read);
        return lector.next();
    }
}
