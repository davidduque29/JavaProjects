
package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
       int oprimir = 0;

        do {
              int a = 1, b = -1, num = 0;

            System.out.println("");
            System.out.println("***Bienvenido a la Serie Fibonacci**");
            System.out.println("");
            System.out.println("Objetivo: Sacar la serie fibonacci segun el numero ingresado.");
            System.out.println("");
            System.out.println("Por favor escriba un numero para el rango de la serie fibonacci: ");
            num = leer.nextInt();
            System.out.println("");
            //0 1 1 2 3 5 8 13
              

            for (int i = 1; i <= num; i++) {

                a = a + b;
                System.out.println("a: "+a+" + "+b);
                b = a - b;
               
                 
                System.out.println("a + b");
                System.out.println("b: "+a+" + "+b);
                System.out.println("a= " + a +"\n ___________\n");

            }
            System.out.println("Para repetir el programa marque(1)");
            System.out.println("de lo contrario otro número. ");
            System.out.println("------------------------------------");
            oprimir = leer.nextInt();

        } while (oprimir == 1);
    }//fin proceso

}
