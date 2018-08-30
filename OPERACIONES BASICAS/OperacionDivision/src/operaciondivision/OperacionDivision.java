/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciondivision;

import java.util.Scanner;

public class OperacionDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numerador, denominador, resultado, oprimir;
        
        do {
          
       
        System.out.println("");
        System.out.println("***Bienvenido al Ejercicio de la División***");
        System.out.println("");
        System.out.println("Objetivo: Dividir un numero por el otro numero.");
        System.out.println("");
        System.out.println("Por favor escriba el numerador: ");
        numerador = leer.nextInt();
        System.out.println("");

        do {
                System.out.println("Por favor escriba el denominador: ");
                denominador = leer.nextInt();
                if (denominador == 0) {
                    System.out.println("");
                    System.out.println("“Error división por 0”");
                    System.out.println("");
                } else{
                    
                  
                }

            }while (denominador == 0);

                System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
        oprimir=leer.nextInt();
        } while (oprimir == 1);
    }//fin del argumento
    
    } 
