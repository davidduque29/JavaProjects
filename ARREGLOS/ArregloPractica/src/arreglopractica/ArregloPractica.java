/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglopractica;

import java.util.Scanner;

public class ArregloPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String material = null;
        
//        int numero=0, total=0, num=0;
//        
//        System.out.println("que numero multiplica:");
//        num = leer.nextInt();
//        
//        System.out.println("Cuantos numero desea ver: ");
//            numero = leer.nextInt();
//            
//      
//            
//        for (int i = 1; i < numero+1; i++) {
//            total=num*i;
//            
//            System.out.println(""+ num +" x "+ i +" = "+ total);
//            
//        }
//        System.out.println("la multiplicacion eentre: " + total);
  
        String nombre=null;
        String arreglo[]=new String[12];

            arreglo[0]="maiz";
            arreglo[1]="leche";
            arreglo[2]="polvo";
            arreglo[3]="colorante";
            arreglo[4]="conservante";
            arreglo[5]="azucar";
            arreglo[6]="MAIZ";
            arreglo[7]="LECHE";
            arreglo[8]="POLVO";
            arreglo[9]="COLORANTE";
            arreglo[10]="CONSERVANTE";
            arreglo[11]="AZUCAR";
          
            System.out.println(" Para buscar un materia favor escribir un numero 1 - 10: ");
            material = leer.nextLine();
            
            for (int i = 0; i < 12; i++) {
            
           
                System.out.println("materiañ es: "+ material);}
//          System.out.println("material es = "+ arreglo[i]);
//                if (arreglo [i] == nombre) {
//                  System.out.println("ERROR DATO REPETIDO"); 
//                }
//                
//                else{   
//                    System.out.println("material "+ arreglo [i]);
//                }                       
        }
            
        
        
       
     }//fin proceso          
}