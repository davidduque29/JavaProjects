/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzadado;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class LanzaDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int rep_programa, a, b;
        System.out.println("");
            System.out.println("------------------------");
        System.out.println("Bienvenido al programa:");
        System.out.println("AREA Y PERIMETRO");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Objetivo: tienes que sacar dos numeros iguales, tres veces seguidas\n ");
        System.out.println("");
        do {
            System.out.println("");
            System.out.println("Presione enter para lanzar el dado");
            System.out.println("");
            System.in.read();
            Random azar = new Random();
            Scanner teclado = new Scanner(System.in);
            a = azar.nextInt(3) + 1;
            System.out.println(a);
            b = azar.nextInt(3) + 1;
            System.out.println(b);
            if (a == b) {
                System.out.println("Vas un par \n Presiona enter para lanzar de nuevo");
                System.in.read();
                a = azar.nextInt(3) + 1;
                System.out.println(a);
                b = azar.nextInt(3) + 1;
                System.out.println(b);

                if (a == b) {
                    System.out.println("Vas dos pares \n Presiona enter para lanzar de nuevo");
                    System.in.read();
                    a = azar.nextInt(3) + 1;
                    System.out.println(a);
                    b = azar.nextInt(3) + 1;
                    System.out.println(b);
                    if (a == b) {
                        System.out.println("Vas dos tres paresssss !Ganaste¡ felicitaciones \n Presiona enter para Jugar de nuevo");
                        System.in.read();

                    } else {
                        System.out.println("** PERDISTE ***");
                        System.out.println("intenta de nuevo");
                    }

                } else {
                     System.out.println("** PERDISTE ***");
                    System.out.println("intenta de nuevo");
                }

            } else {
                 System.out.println("** PERDISTE ***");
                System.out.println("Intenta de nuevo");
            }

            System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
            rep_programa = teclado.nextInt();
        } while (rep_programa == 1);
    }
}
