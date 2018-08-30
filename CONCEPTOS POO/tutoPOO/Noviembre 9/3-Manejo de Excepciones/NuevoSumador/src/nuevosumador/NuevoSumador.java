/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevosumador;

/**
 *
 * @author ivandavid
 */
public class NuevoSumador {

    public static void main(String[] arguments) {
        float sum = 0;
        for (int i = 0; i < arguments.length; i++) {
            try {
                sum = sum + Float.parseFloat(arguments[i]);
            } catch (NumberFormatException e) {
                System.out.println(arguments[i] + " no es un número.");
            }
        }
        System.out.println("Esos números suman un total de " + sum);
    }
    
}
