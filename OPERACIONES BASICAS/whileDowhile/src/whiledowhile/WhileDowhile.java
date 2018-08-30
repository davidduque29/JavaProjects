/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiledowhile;

import java.util.Scanner;
public class WhileDowhile {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, result;
        do {
        System.out.println("Por favor escriba un numero: ");
        num=leer.nextInt();
        result=1+num;
            System.out.println("El numero no puede ser 0");
            
        } while (num == 0);
        System.out.println("El numero es "+ result);
        
    }
    
}
