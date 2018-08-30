/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopunto1;

import java.util.Scanner;

public class PooPunto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int size;
        
        ColeccionEnteros tamaño = new ColeccionEnteros(0);
        
        System.out.println("");
        size=leer.nextInt();
        
        tamaño.setArreglo(size);
        tamaño.getArreglo();
    }
    
}
