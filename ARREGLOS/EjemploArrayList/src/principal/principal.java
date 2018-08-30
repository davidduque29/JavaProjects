/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        List<String> letras= new ArrayList<String>();
        
        String nombre, apellido;
        
        System.out.println("Escriba su nombre");
        nombre=leer.nextLine();
        
        System.out.println("Escriba su apellido");
        apellido=leer.nextLine();
        
        System.out.println("\n");
        letras.add(nombre);
        letras.add(apellido);
        letras.add("c");
        letras.add("e");
        letras.add("d");
        
        Collections.sort(letras,Collections.reverseOrder());
        
        for(String elemento:letras){
            System.out.println("* "+elemento);
        
        }
    }
    
}
