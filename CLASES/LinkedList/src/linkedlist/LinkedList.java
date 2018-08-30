/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;


import java.util.LinkedList;

public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        
       lista.add("palabra");
       lista.add(5);
       lista.add(1,17);
       
        System.out.println("El tamañao de la lista es: "+lista.size);
    }
    
}
