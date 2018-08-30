/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucolores;

import java.util.Scanner;

public class MenuColores {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, oprimir;
        do {
     
        System.out.println("------------------------");
        System.out.println("Bienvenido al programa:");
        System.out.println("COMBINACION DE COLORES");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("Objetivo: Combinar colores.");
        System.out.println("");
        System.out.println("Colores:");
        System.out.println("");
        System.out.println("1. Amarillo");
        System.out.println("2. Azul");
        System.out.println("3. Rojo");
        System.out.println("");
        do {
              System.out.println("Digite el primer(1º) numero del color que desea combinar: ");
        num1=leer.nextInt();
        
            if (num1 > 3  ) {
                System.out.println("**El numero "+ num1 +" esta fuera de rango**");
                System.out.println("");
                }else if (num1 < 1){
                       System.out.println("**El 0 no es un numero valido**");
                System.out.println("");
            }
            else{
            }
       
        } while (num1 > 3 | num1 < 1);
        
         System.out.println("");
      
        do {
              System.out.println("Digite el segundo(2º) numero del color que desea combinar: ");
        num2=leer.nextInt();
        
            if (num2 > 3) {
                System.out.println("**El numero "+ num2 +" esta fuera de rango**");
                System.out.println("");
             }else if (num2 < 1){
                       System.out.println("**El 0 no es un numero valido**");
                System.out.println("");
            }
            else{
            }
       
        } while (num2 > 3 | num2 < 1);
        System.out.println("");
        if ( num1==1 & num2==1 ) {
            System.out.println("El resultado de la combinacion de");
            System.out.println("los colores es: Amarillo" );
         
        }else if ( num1==1 & num2==2 ){
            System.out.println("El resultado de la combinacion de");
            System.out.println("los colores es: Verde" );
        
         }else if ( num1==2 & num2==1 ){
            System.out.println("El resultado de la combinacion de");
            System.out.println("los colores es: Verde" );  
         
         }else if ( num1==1 & num2==3 ){
            System.out.println("El resultado de la combinacion de");
            System.out.println("los colores es: Naranja" );
            
         }else if ( num1==3 & num2==1 ){
            System.out.println("El resultado de la combinacion de");
            System.out.println("los colores es: Naranja" );
            //////// fin opcion: 1
            
        }else if ( num1==2 & num2==2 ){
            System.out.println("El resultado de la combinacion de");
            System.out.println("los colores es: Azul" );
            
        }else if ( num1==2 & num2==3 ){
           System.out.println("El resultado de la combinacion de");
           System.out.println("los colores es: Morado" );  
        
        }else if ( num1==3 & num2==2 ){
           System.out.println("El resultado de la combinacion de");
           System.out.println("los colores es: Morado" );  
            //////// fin opcion: 2
            
        }else if ( num1==3 & num2==3 ){
            System.out.println("El resultado de la combinacion de");
            System.out.println("los colores es: Rojo" );
            
        }else{
            System.out.println("::: No ingreso ningun color :::");
        }
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
        oprimir=leer.nextInt();
        } while (oprimir == 1);
    }//fin del argumento
    
}
