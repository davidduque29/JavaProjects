/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipostriangulos;

import java.util.Scanner;

public class TiposTriangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu, lado1, lado2, lado3, ab, ac, bc, ang1, ang2, ang3, angt, denuevo;
        do {
            System.out.println("------------------------");
        System.out.println("Bienvenido al programa:");
        System.out.println("TIPOS DE TRIANGULOS");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("Objetivo: Segun los datos ingresados saber si es o no un triangulo.");
        System.out.println("");
        System.out.println("Si desea ingresar los lados presione 1");
        System.out.println("");
        System.out.println("Si desea ingresar los ángulos presione otro número");
        System.out.println("");
            Scanner m = new Scanner(System.in);
            menu = m.nextInt();
            if (menu == 1) {
                do {
                    System.out.println("");
                    System.out.println("Por Favor Ingrese Lado 1");
                    Scanner l1 = new Scanner(System.in);
                    lado1 = l1.nextInt();
                    while (lado1 <= 0) {
                        System.out.println("");
                        System.out.println("Debe Ingresar Una Medida Mayor A 0");
                        lado1 = l1.nextInt();
                    }
                    System.out.println("");
                    System.out.println("Por Favor Ingrese Lado 2");
                    Scanner l2 = new Scanner(System.in);
                    lado2 = l2.nextInt();
                    while (lado2 <= 0) {
                        System.out.println("");
                        System.out.println("Debe Ingresar Una Medida Mayor A 0");
                        lado2 = l2.nextInt();
                    }
                    System.out.println("");
                    System.out.println("Por Favor Ingrese Lado 3");
                    Scanner l3 = new Scanner(System.in);
                    lado3 = l3.nextInt();
                    while (lado3 <= 0) {
                        System.out.println("");
                        System.out.println("Debe Ingresar Una Medida Mayor A 0");
                        lado3 = l3.nextInt();
                    }
                    ab = lado1 + lado2;
                    ac = lado1 + lado3;
                    bc = lado2 + lado3;
                    if (ab < lado3 || ac < lado2 || bc < lado1) {
                        System.out.println("**Las Medidas Ingresadas No Son Las De Un Triángulo**");
                    }
                } while (ab < lado3 || ac < lado2 || bc < lado1);
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("Es Un Triángulo Equilatero");
                } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                    System.out.println("Es Un Triángulo Escaleno");
                } else {
                    System.out.println("Es Un Triangulo Isoseles");
                }
            } else {
                do {
                    System.out.println("Por Ingrese Angulo 1");
                    Scanner a1 = new Scanner(System.in);
                    ang1 = a1.nextInt();
                    while (ang1 <= 0) {
                        System.out.println("Debe Ingresar Una Medida Mayor A 0");
                        ang1 = a1.nextInt();
                    }
                    System.out.println("Por Ingrese Angulo 2");
                    Scanner a2 = new Scanner(System.in);
                    ang2 = a2.nextInt();
                    while (ang2 <= 0) {
                        System.out.println("Debe Ingresar Una Medida Mayor A 0");
                        ang2 = a2.nextInt();
                    }
                    System.out.println("Por Favor Ingrese Angulo 3");
                    Scanner a3 = new Scanner(System.in);
                    ang3 = a3.nextInt();
                    while (ang3 <= 0) {
                        System.out.println("Debe Ingresar Una Medida Mayor A 0");
                        ang3 = a3.nextInt();
                    }
                    angt = ang1 + ang2 + ang3;
                    if (angt != 180) {
                        System.out.println("Los Angulos Ingresados No son De Un Triángulo");
                    }
                } while (angt != 180);
                if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
                    System.out.println("Es Un Triángulo Rectángulo");
                }
                if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
                    System.out.println("Es Un Triángulo Obtusángulo");
                }
                if (ang1 < 90 && ang2 < 90 && ang3 < 90) {
                    System.out.println("Es Un Triángulo Acutángulo");
                }
            }
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
            Scanner leer = new Scanner(System.in);
            denuevo = leer.nextInt();
        } while (denuevo == 1);
    }
    
}
