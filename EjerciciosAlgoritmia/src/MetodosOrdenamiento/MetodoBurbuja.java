/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosOrdenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SantiDuque
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        System.out.println("*Defina el tamaño del arreglo: \n");
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de eleemntos del arreglo:"));

        // Asiganamos el numero de elementos que el usuario ha digitado
        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un numero:");
            arreglo[i] = entrada.nextInt();
            System.out.println("");
        }
        //Metodo Burbuja
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) { // si # actual es MAYOR a # siguiente
                    aux = arreglo[j]; // numero actual
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo ordenado en forma creciente\n");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i] + " - ");
        }
        System.out.println("");

        try {
            System.out.println("Arreglo ordenado en forma decreciente\n");
            for (int i = (nElementos-1); i >= 0; i--) {
                System.out.println(arreglo[i] + " - ");
            }
        } catch (Exception e) {
            System.out.println("Decreciente - error: " + e);
        }
    }

}
