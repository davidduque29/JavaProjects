/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodorandom;

import java.util.Scanner;
import java.util.Random;

public class MetodoRandom {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); //newo tecla tab
        Random azar= new Random (); 
        int limite=0, aleatorio=0, oprimir;
        
        do {
      
        System.out.println("Bienvenido a su programa CHANCE");
        System.out.println("");
        System.out.println("Objetivo: Este programa saca un numero al azar desde 0 hasta el numero que usted digite: ");
        System.out.println("");
        System.out.println("Por favor digite el umbral: ");
        limite=leer.nextInt();
        aleatorio=azar.nextInt(limite);
        System.out.println("Tu numero Ganador es:"+ aleatorio);
        
        
System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
        oprimir=leer.nextInt();
        } while (oprimir == 1);
    }//fin del argumento
    
}