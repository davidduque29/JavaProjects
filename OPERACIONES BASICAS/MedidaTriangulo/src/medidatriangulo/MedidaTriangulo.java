/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidatriangulo;
import java.util.Scanner;

public class MedidaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        double[] lados = new double[3];
        double[] angulos = new double[3];
        int repPrograma, tipoTriangulo;
        double aux;

           System.out.println("------------------------");
        System.out.println("Bienvenido al programa:");
        System.out.println("TIPOS DE TRIANGULO");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("ObjETIVO: Si ingresa por lados ");
        do {
            System.out.println("Seleccione las medidas que va a ingresar : " + " \n" + "1 .Lados" + "\n" + "2.Angulos");
            tipoTriangulo = pedir.nextInt();
            switch (tipoTriangulo) {
                case 1:
                    for (int i = 0; i < 3; i++) {

                        System.out.println("Ingrese el " + (i + 1) + " lado");
                        lados[i] = pedir.nextDouble();
                    }
                    if (lados[0] > lados[1]) {
                        aux = lados[0];
                        lados[0] = lados[1];
                        lados[1] = aux;
                    }
                    if (lados[0] > lados[1] && lados[1] > lados[2]) {
                        aux = lados[1];
                        lados[1] = lados[2];
                        lados[1] = aux;
                    }
                    if (lados[0] + lados[1] > lados[2]) {

                        if (lados[0] == lados[1] && lados[1] == lados[2]) {
                            System.out.println("Es un Triangulo Equilatero");
                        } else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
                            System.out.println("Es un triangulo isoseles");
                        } else if (lados[0] != lados[1] && lados[0] != lados[1] && lados[1] != lados[2]) {
                            System.out.println("Es un triangulo escaleno");
                        }
                    } else {
                        System.out.println("Esto no es un triangulo");
                    }

                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {

                        System.out.println("Ingrese el " + (i + 1) + " angulo");
                        lados[i] = pedir.nextDouble();
                    }
                    if (lados[0] > lados[1]) {
                        aux = lados[0];
                        lados[0] = lados[1];
                        lados[1] = aux;
                    }
                    if (lados[0] > lados[1] && lados[1] > lados[2]) {
                        aux = lados[1];
                        lados[1] = lados[2];
                        lados[1] = aux;
                        System.out.println(lados[1] + lados[2] + lados[3]);
                    }
                    if (lados[0] + lados[1] + lados[2] == 180) {

                        if (lados[0] == 90 || lados[1] == 90 || lados[2] == 90) {
                            System.out.println("Es un Triangulo Rectangulo");
                        } else if (lados[0] < 90 && lados[1] < 90 && lados[2] < 90) {
                            System.out.println("Es un triangulo acutangulo");
                        } else if (lados[0] > 90 || lados[1] > 90 || lados[2] > 90) {
                            System.out.println("Es un triangulo escaleno");
                        }
                    } else {
                        System.out.println("Esto no es un triangulo");
                    }

                    break;
                default:
                    System.out.println("Porfavor ingrese un valos valido " + tipoTriangulo + "no es un valor vallido");
                    break;
            }

            System.out.println("presione :" + "\n" + "1.Si desea repetir el programa");
            repPrograma = pedir.nextInt();
        } while (repPrograma == 1);

    }
}
