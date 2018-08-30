/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lasvariables_for;

import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class LasVariables_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner coso = new Scanner(System.in); 
                int numero;
                        
                System.out.println("Por favor digite un numero");
                numero=coso.nextInt();
        
                
        for (int i = 1; i < 13; i++) {
            System.out.println(numero+ "  x" + i + " = "+ (numero*i));
            
        }
        // TODO code application logic here
    }
    
}
