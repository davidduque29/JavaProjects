/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionresta;

import java.util.Scanner;

public class OperacionResta {

    public static void main(String[] args) {
             Scanner leer= new Scanner (System.in);
       int num1, num2, resultado, oprimir;
       
        do {
            
  
        System.out.println("");
        System.out.println("***Bienvenido al Ejercicio de la Resta***");
        System.out.println("");
        System.out.println("Objetivo: Restar dos numeros.");
        System.out.println("");
        System.out.println("Por favor escriba el primer numero: ");
        num1=leer.nextInt ();
        
        System.out.println("Por favor escriba el segundo numero: ");
        num2=leer.nextInt ();
        System.out.println("");
        resultado= num1-num2;
        System.out.println("El resultado es: "+ resultado);
        
                System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
        oprimir=leer.nextInt();
        } while (oprimir == 1);
    }//fin del argumento
    }
    
