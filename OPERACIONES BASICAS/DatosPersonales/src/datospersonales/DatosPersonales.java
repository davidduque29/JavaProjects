/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class DatosPersonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         
             
        String nombre, apodo;
        int edad, num=0;
        
       do {
        
        System.out.println("::::: DATOS PERSONALES ::::::: \n");
        
           System.out.println("apodo");
        apodo=leer.nextLine();
        
        System.out.println("* Por favor escriba su nombre: \n");
        nombre=leer.nextLine();
        System.out.println("");
            
        System.out.println("* Por favor escriba su edad: \n");
        edad=leer.nextInt();
        System.out.println("");
        
        System.out.println("Su nombres es: "+ nombre);
        System.out.println("Su edad es: "+ edad);
        
        System.out.println(".......................");
      
            if (edad == 0) {
                System.out.println("El numero 0 no coresponde a un numero de edad");
            }else{}
        
        if (edad >= 18 ) {
            System.out.println("Señor "+ nombre +" Usted es mayor de edad");
            
        }else{
            System.out.println("Señor "+ nombre +" usted es menor de edad");
        }
            
          System.out.println("....................... \n");
            System.out.println("Para repetir digite (1)");
            num=leer.nextInt();
       } while (num ==1);   
    }
    
}
