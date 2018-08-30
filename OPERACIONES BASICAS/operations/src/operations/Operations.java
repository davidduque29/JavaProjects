/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class Operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("num1: ");
        num1=leer.nextInt();
        
        System.out.println("num2: ");
        num2=leer.nextInt();
        
        operacion opera = new operacion(0,0);
        opera.setNum1(num1);
        opera.setNum1(num2);
        opera.operaciones();
    }
    
}
