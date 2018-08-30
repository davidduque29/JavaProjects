/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rugir r = new Rugir("Pantera","carnivoro");
        System.out.println("Animal: "+r.getNombre());
        r.Rugido();        
        
        Nacimiento n = new Nacimiento("Leon","carnivoro");
        System.out.println("Animal: "+n.getNombre());
        n.Nacimiento();
    }
    
}
