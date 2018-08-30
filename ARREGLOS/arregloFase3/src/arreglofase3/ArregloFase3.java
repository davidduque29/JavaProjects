/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglofase3;

import java.util.Scanner;
/**
 *
 * @author ivandavid
 */
public class ArregloFase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo[]=new int[5];
        
        arreglo[0]=8;
        arreglo[1]=7;
        arreglo[2]=2;
        arreglo[3]=4;
        arreglo[4]=7;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor= "+arreglo[i]);

        }
        System.out.println("");
        
        for (int i = 4; (i < 5&& i>=0); i--) {
            System.out.println("Valor inverso= "+arreglo[i]);
        }
    }
    
}
