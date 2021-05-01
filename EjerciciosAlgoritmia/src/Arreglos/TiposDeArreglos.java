/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author SantiDuque
 */
public class TiposDeArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // Esta es una de las formas de declarar un arreglo
            int arregloBasico[];
            // Esta es la segunda forma de declarar un arreglo, 
            // asignandole un tamaño de 8 posiciones
            int[] arregloBasico2 = new int[8];
            // Esta forma de declarar un arreglo con datos inicales
            int[] miArreglo = {1, 1, 2, 3, 2, 1, 3, 5, 1};
           
            // Informacion Ciclo FOR :
            //int i - Es el "valor inicial" del for
            //  i< miArreglo.length - es la "condicion"
            // i++ el tamaño del "paso" al siguiente valor
            
            // Ejercicio: Crear un histograma con los numeros de miArreglo de la siguiente manera
            // 
            String num1 = "";
            String num2 = "";
            String num3 = "";
            String num4 = "";
            String num5 = "";
       
            
            for (int i = 0; i < miArreglo.length; i++) {
                
                switch (miArreglo[i]) {
                    case 1:
                        num1+="*";
                        break;
                    case 2:
                        num2+="*";
                        break;
                    case 3:
                        num3+="*";
                        break;
                    case 4:
                        num4+="*";
                        break;
                    case 5:
                        num5+="*";
                        break;
                    default:
                      
                }
               
            }
            System.out.println("1 "+num1);
            System.out.println("2 "+num2);
            System.out.println("3 "+num3);
            System.out.println("4 "+num4);
            System.out.println("5 "+num5);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

}
