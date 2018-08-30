/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3_a;

/**
 *
 * @author ivandavid
 */
public class Punto3_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaterialSobrante material = new MaterialSobrante("",0);
        
        System.out.println("::: PUNTO 3 - A.CLASE :::\n");
        
        material.setNombre("conservante");
        material.setCantidad(2);
        
        System.out.println("El material sobrante es: "+material.getNombre()
                +" la cantidad es:"+material.getCantidad());
    }
    
}
