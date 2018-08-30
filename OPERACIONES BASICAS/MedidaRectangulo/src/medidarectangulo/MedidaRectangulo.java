/*
Diseñe un programa (en consola) que encuentre el área y perímetro de un rectángulo o un
círculo mostrando un menú para que seleccione, cuadrado o circulo luego pida los datos
necesarios para das solución y muestre en pantalla el nombre de la figura su área en
unidades cuadradas y su perímetro en unidades simples, recuerde que no existen áreas o
perímetros menores o iguales a cero.
 */
package medidarectangulo;

import java.util.Scanner;

public class MedidaRectangulo {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
        int opciones;
        double opcion, radio, perimetroc, perimetro, areac, pi=Math.PI, result, arear;
   
        do {
      
        System.out.println("------------------------");
        System.out.println("Bienvenido al programa:");
        System.out.println("AREA Y PERIMETRO");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("Objetivo: Hallar el area o perimetro segun la figura.");
        System.out.println("");
        System.out.println("1.Circulo(halla el Areao o Perimetro de un circulo) ");
        System.out.println("2.Rectangulo(halla el area o perimetro de un rectangulo");
       
        opcion=teclado.nextInt();
        
        System.out.println("");
        if (opcion==1) {
            System.out.println("FIGURA: CIRCULO");
            System.out.println("");
            System.out.println("Para hallar el Area y el Perimetro ingrese los siguientes datos: ");
            System.out.println("");
            
          
              do {
                System.out.println("Ingrese el radio del circulo");
                radio=teclado.nextInt();
                
                if (radio==0) {
                System.out.println("no se puede calcular por que no existen circulo con radios iguales a cero ");
                
                }           
              else{
                    
                }
               }while (radio == 0);
                
                 areac=(radio*radio)*pi;
                 perimetroc= 2*pi*radio;
                 
                 System.out.println("");
                 System.out.println("::::::::::::::::::::::::::::::::::::");
                 System.out.println("* Figura: Rectangulo");
                 System.out.println("");
                 System.out.println("El area es :"+ areac + " cm^2");
                 System.out.println("");
                 System.out.println("El perimetro  es :"+ perimetroc +" cm");
                 System.out.println("::::::::::::::::::::::::::::::::::::");
                 System.out.println("");
            
       System.out.println("");
        }else if (opcion==2) {
              System.out.println("FIGURA: Rectangulo");
            System.out.println("");
            System.out.println("Para hallar el Area y el Perimetro ingrese los siguientes datos: ");
            System.out.println("");
            System.out.println("ingrese el valor de la base");
            int base=teclado.nextInt();
            System.out.println("");
            
            System.out.println("Ingrese el valor de la altura");
            int h=teclado.nextInt();
            
            if (base<0||h<0) {
                System.out.println("no se puede calcular por que no existen rectandulos con base o altura iguales a cero ");
            }else  {
                arear = base*h;
                perimetro = (base*2)+(h*2);
                
                System.out.println("");
                System.out.println("::::::::::::::::::::::::::::::::::::");
                System.out.println("* Figura: Rectangulo");
                System.out.println("");
                System.out.println("el area es :"+arear + " cm^2");
                System.out.println("el perimetro es :"+perimetro +" cm");
                System.out.println("::::::::::::::::::::::::::::::::::::");
                System.out.println("");
            }
        }else{
                System.out.println("valor no valido");
            }
             System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Para repetir el programa marque(1)");
        System.out.println("de lo contrario otro número. ");
        System.out.println("------------------------------------");
        opciones=teclado.nextInt();
        
        } while (opciones == 1);
    }
}
