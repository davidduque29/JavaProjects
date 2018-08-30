/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglorandom;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author ivandavid
 */
public class ArregloRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []Arreglo;
        Arreglo=arreglo();
        
    }
    
    public static int[] arreglo (){
   int a = 0;
   int [] array;
   
   array= new int[5];
   Random b= new Random();
   while (a !=4){
       array[a]=b.nextInt(10);
       
   a=a+1;
   }
        System.out.println(Arrays.toString(array));
           
   return array;
    }
    
    public static void voltear (int[] arreglo){
        
    int a =4, c=0;
    int [] array;
    array = new int[5];
    
       while (a !=0 && c!=4){
       array[a]=arreglo[c];
       
   a=a-1;
   c=c+1;
    
    }
   }
    
}
