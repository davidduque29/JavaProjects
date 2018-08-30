/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listavinculada;

import java.util.LinkedList;
import java.util.Scanner;

public class Listavinculada {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int opcion= 0;
        Scanner leer = new Scanner(System.in);
        
          System.out.println("Escrba de 0 a 5");
        opcion=leer.nextInt();
        
        LinkedList listar = new LinkedList();

        listar.add("Maiz");
        listar.add("Leche");
        listar.add("Polvo");
        listar.add("Colorante");
        listar.add("Conservante");
        listar.add("Azucar");

        System.out.println("contiene: "+ listar.contains("Polvo"));
        
//        if (opcion == 1) {
//            System.out.println("El producto es: " + listar.getFirst());
//            System.out.println("Disponible: 2 unidades");
//        }else{
//
//        }
//         if (opcion == 2) {
//            System.out.println("El producto es: " + listar.get(1));
//             System.out.println("Disponible: 5 unidades");
//        }else{
//
//        }
        do {
            
        
        
        String nombre = null;
        System.out.println("escribir nombre: "); 
        nombre=leer.next();

        LinkedList buscar = new LinkedList();

        buscar.add("maiz");
        buscar.add("leche");
        buscar.add("polvo");
        buscar.add("colorante");
        buscar.add("conservante");
        buscar.add("azucar");
        buscar.add("Maiz");
        buscar.add("Leche");
        buscar.add("Polvo");
        buscar.add("Colorante");
        buscar.add("Conservante");
        buscar.add("Azucar");

        if (buscar.contains(nombre)) {
            System.out.println("El producto ya existe");
        } else {
        }
        } while (true);
    }

}
