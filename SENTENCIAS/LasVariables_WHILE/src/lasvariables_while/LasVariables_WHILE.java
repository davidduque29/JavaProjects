/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasvariables_while;

import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class LasVariables_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner coso = new Scanner(System.in);
        int numero, contador = 1;
        System.out.println("Por favor digite un numero: ");
        numero = coso.nextInt();
                //tabla de multiplicar usando While

        while (contador < 12) {
            contador = contador + 1;
            System.out.println(numero + "x" + contador + " = " + (numero * contador));
        }
    }   
}
