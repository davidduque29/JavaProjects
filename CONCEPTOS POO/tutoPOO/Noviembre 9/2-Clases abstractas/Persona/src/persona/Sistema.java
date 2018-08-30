/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;


public class Sistema {
    
    public static void main(String[] args){
        
        David ivan = new David();
        ivan.setNombre("Me llamo ivan");
        ivan.setEdad(27);
        System.out.println(""+ivan.getNombre());
        System.out.println("Ivan tiene: "+ivan.getEdad()+" años");
        ivan.hablar();
        ivan.caminar();
        ivan.dormir();
        ivan.estornudar();
        
        System.out.println(" ");
        Juan juan = new Juan();
        juan.hablar();
        juan.caminar();
        juan.dormir();
        juan.setNombre("Me llamo Juan");
        juan.setEdad(35);
        System.out.println(""+juan.getNombre());
        System.out.println("La edad de Juan es: "+ juan.getEdad()+" años");
    }
}
