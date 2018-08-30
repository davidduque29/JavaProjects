/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg6_rectangulo_circulo;

import java.util.Scanner;
/**
 *
 *  Diseñe un programa (en consola) que encuentre el área y perímetro de un rectángulo o un
     círculo mostrando un menú para que seleccione, cuadrado o circulo luego pida los datos
 *   necesarios para das solución y muestre en pantalla el nombre de la figura su área en
    unidades cuadradas y su perímetro en unidades simples, recuerde que no existen áreas o
    perímetros menores o iguales a cero.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pm = new Scanner(System.in);
        
        int num, altura, base, perimetro, area;
        
        
        System.out.println("Bienvenido a las figuras: Rectangulo y circulo");
        System.out.println("");
        
        System.out.println("Elija que figura desea calcular y oprima el numero: ");
        System.out.println("1.Rectangulo");
        System.out.println("2.Circulo");
        
        num= pm.nextInt();
        
        if (num == 1) {// Rectangulo
            
            System.out.println("BIENVENIDO AL AREA Y PERIMETRO DEL RECTANGULO");
            System.out.println("");
            System.out.println("Por favor ingrese el valor de la altura:");
            altura=pm.nextInt();
            System.out.println("");
            
            System.out.println("Por favor ingrese el valor de la base: ");
            base=pm.nextInt();
            
            perimetro=(base*base)+(altura*altura);
            area=(base*altura);
            System.out.println("");
            
            System.out.println("El perimetro es: "+ perimetro);
            System.out.println("El Area es: "+ area);
        }
        
        
    }
    
}
