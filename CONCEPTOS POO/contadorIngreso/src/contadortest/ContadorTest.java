/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadortest;

import java.util.Scanner;
/**
 *
 * @author ivandavid
 */
public class ContadorTest {

   public static  Scanner in = new Scanner(System.in);
   public static String nombre, clave;
   public static int contador=0;
   public static String op="1";
public static Cuenta d = new Cuenta("","");
   
    public static void main(String[] args) {
        
        
        do {
            
            ingresar();
 
            contador=contador+1;
            System.out.println("Cantidad ingreso: "+ contador);
            
            System.out.println("\n -para repetir oprima 1.");
            System.out.println("\n -para terminar cualquier tecla");
            op=in.nextLine();  
            
        } while (op.equals("1"));
        
        System.out.println("nada");
        
//        c.mostrarDatos();
        d.mostrarallDatos();
                
       
    }
    public static void ingresar(){
        
   
        
 System.out.println("Por favor escriba su nombre");
 nombre=in.nextLine();
 
 System.out.println("Por favor escriba su contraseña");
 clave=in.nextLine();
 
Cuenta c = new Cuenta (nombre,clave);
c.agregarCuenta(c);
c.mostrarDatos();
}
}

