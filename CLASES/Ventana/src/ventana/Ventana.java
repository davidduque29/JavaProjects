/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.*;
import java.util.Scanner;

public class Ventana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("titulo ventana");
        JLabel etiqueta = new JLabel("HOLA PUTO");
        JDesktopPane panel = new JDesktopPane();
        Scanner leer = new Scanner(System.in);

        int num1, num2, result;

        System.out.println("Por favor escriba el 1º numero: ");
        num1 = leer.nextInt();

        System.out.println("Por favor escriba el 2º numero: ");
        num2 = leer.nextInt();

        result = num1 + num2;
        System.out.println("");
        System.out.println("El resultado es: " + result);

        etiqueta.setBounds(20, 20, 100, 20);

        panel.add(etiqueta);
        ventana.add(panel);
        ventana.setVisible(true);
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
    }

}
