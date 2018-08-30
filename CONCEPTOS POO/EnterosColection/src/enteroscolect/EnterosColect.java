/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteroscolect;

import java.util.Scanner;

public class EnterosColect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("* Ingrese el tamaño del arreglo a instanciar: ");
        Coleccion col = new Coleccion(leer.nextInt());
        
       col.desplegarColeccion();
       // num.promedioValores();
     
    }
   
}
