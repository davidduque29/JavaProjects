/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraswitch;

import java.util.Scanner;

public class CalculadoraSwitch {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion, num1, num2, resultado, presione;
        

        do {

            System.out.println("BIENVENIDO AL PROGRAMA:");
            System.out.println("::::: OPERACIONES ::::::");
            System.out.println("");

            System.out.println("• OPCIONES:");
            System.out.println("");
            System.out.println("1.SUMA [+]:");
            System.out.println("2.RESTA [-]:");
            System.out.println("3.MULTIPLICACION [*]:");
            System.out.println("DIVISION [/]:");
            System.out.println("PORCENTAJE [%]:");
            System.out.println("POTENCIACION [^]:");
            System.out.println("");

            System.out.println("Por favor digite el numero de su opcion: ");
            opcion = leer.nextInt();

            System.out.println("");

            switch (opcion) {
                case 1:

                    System.out.println("");
                    System.out.println("BIENVENIDO A LA SUMA:");
                    System.out.println("");

                    System.out.println("Objetivo: Sumar dos numeros.");
                    System.out.println("");
                    System.out.println("Por favor escriba el primer numero: ");
                    num1 = leer.nextInt();

                    System.out.println("Por favor escriba el segundo numero: ");
                    num2 = leer.nextInt();
                    System.out.println("");
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    System.out.println("");

                    break;

                case 2:
                    System.out.println("");
                    System.out.println("BIENVENIDO A LA RESTA:");
                    System.out.println("");
                    System.out.println("");

                    System.out.println("Objetivo: Restar dos numeros.");
                    System.out.println("");
                    System.out.println("Por favor escriba el primer numero: ");
                    num1 = leer.nextInt();

                    System.out.println("Por favor escriba el segundo numero: ");
                    num2 = leer.nextInt();
                    System.out.println("");
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);

                    break;

                case 3:
                    System.out.println("");
                    System.out.println("BIENVENIDO A LA MULTIPLICACION:");
                    System.out.println("");
                    System.out.println("Objetivo: Multiplicar dos numeros.");
                    System.out.println("");
                    System.out.println("Por favor escriba el primer numero: ");
                    num1 = leer.nextInt();

                    System.out.println("Por favor escriba el segundo numero: ");
                    num2 = leer.nextInt();
                    System.out.println("");
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 4:
//                        int numerador, denominador;
//                    do {
//                        
//                        
//                        System.out.println("");
//                        System.out.println("BIENVENIDO A LA DIVISION:");
//                        System.out.println("");
//
//                        System.out.println("Objetivo: Dividir un numero por el otro numero.");
//                        System.out.println("");
//                        System.out.println("Por favor escriba el numerador: ");
//                        numerador = leer.nextInt();
//                        System.out.println("");
//
//                        do {
//                            System.out.println("Por favor escriba el denominador: ");
//                            denominador = leer.nextInt();
//                            if (denominador == 0) {
//                                System.out.println("");
//                                System.out.println("“Error división por 0”");
//                                System.out.println("");
//                            } else {
//
//                            }
//
//                        } while (denominador == 0);
//                        break;

                      case 5:
                      
                    System.out.println("");
                    System.out.println("BIENVENIDO AL PORCENTAJE:");
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("");
                    System.out.println("BIENVENIDO A LA POTENCIACION");
                    System.out.println("");

                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("------------------------------------");
                    System.out.println("Para repetir el programa marque(1)");
                    System.out.println("de lo contrario otro número. ");
                    System.out.println("------------------------------------");

                    presione = leer.nextInt();
            }
            while (presione == 1);
        }///fin public class


    }
