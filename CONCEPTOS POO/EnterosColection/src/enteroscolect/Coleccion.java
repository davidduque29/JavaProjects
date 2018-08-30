/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteroscolect;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class Coleccion {
    private int[] arreglo;
    
    public Coleccion(int tamaño){
    
        arreglo = new int[tamaño];
        Random azar = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = azar.nextInt(100);
        }
    }
    public void desplegarColeccion(){
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("Valor en ("+i+ ") Es "+arreglo[i]);
        }
    }  
}
