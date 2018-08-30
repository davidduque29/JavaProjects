/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimir2;


public class Imprimir2 {

     int x = 0;
     int y = 1 ;

     void imprimeme() {
         System.out.println( "x es " + x + " , y es " + y) ;
         System.out.println( "Soy una instancia de la clase " +
         this.getClass().getName() ) ;
     }
 }

 class SubImprimir2 extends Imprimir2 {
     int z = 3;
     @Override
     void imprimeme() {
       System.out.println( "x es " + x + " , y es " + y + ", z es " + z);
       System. out. println( "Soy una instancia de la clase " +
       this.getClass().getName()) ;
     }

     public static void main(String[] arguments) {
         SubImprimir2 obj = new SubImprimir2();
         obj.imprimeme() ;
     }
    
}
