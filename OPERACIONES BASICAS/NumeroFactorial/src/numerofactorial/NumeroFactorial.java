package numerofactorial;

import java.util.Scanner;

public class NumeroFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
int oprimir = 0;
        do {
                int factorial = 1, num = 0;
                        
            System.out.println("");
            System.out.println("***Bienvenido al numero FACTORIAL**");
            System.out.println("");
            System.out.println("Objetivo: Sacar EL FACTORIAL segun el numero ingresado.");
            System.out.println("");
            
            do {
            System.out.println("Por favor escriba un numero: ");
            num = leer.nextInt();

            if (num < 0) {
                System.out.println("¡¡¡Este factorial no exsite!!!");
                System.out.println("");
            }
            else{
                
            }
             } while (num < 0);
            
            System.out.println("");

            for (int i = 1; i <= num; i++) {

                factorial = (factorial * i);
            }
            System.out.println("");
            System.out.println("Numero: "+ num);
            System.out.println("Su factorial es: " + factorial);
            System.out.println("");
            System.out.println("Para repetir el programa marque(1)");
            System.out.println("de lo contrario otro número. ");
            System.out.println("------------------------------------");
            oprimir = leer.nextInt();
            
        } while (oprimir == 1);
    }//fin proceso

}
