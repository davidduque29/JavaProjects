/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner c = new Scanner(System.in);
       String num="1";
       String num2="1";
       
        do {
            System.out.println("escriba un numero:");
            num=c.nextLine();
            
            
        } while (num.equals(num2));
        
    }
    
}
