/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author ivandavid
 */
public class David extends Persona implements Enfermo {
    
     @Override
     public void hablar(){
         System.out.println("Hola me llamo David");
   }
     @Override
      public void caminar(){
         System.out.println("Hola soy David y estoy caminando");
   }
      public void dormir(){
          System.out.println("No molesta estoy durmiendo..zzzzZZZZ");
      }
     @Override
      public void estornudar(){
          System.out.println("AAAaa...Chuuu");
      }
}
