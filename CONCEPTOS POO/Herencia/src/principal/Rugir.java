/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Santi Duque
 */
public class Rugir extends Animal{
   
    public Rugir(String nombre, String clasificacion) {
        super(nombre, clasificacion);
    }
    @Override
   public void Rugido(){
        System.out.println("Rugido clase Rugir");
   }

}
