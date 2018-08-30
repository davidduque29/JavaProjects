/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author ivandavid
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero num = new Numero();
        
        //num.set(2.5);
        // se le envia un decimal, asi que java decide usar el metodo set de la clase Numero que 
        // tiene como atributo 'double'
        //num.set(12);
        
        num.set(4, 8);
        
        System.out.println("*El numero 1 es: "+ num.getNumero1()+" * El numero 2 es: "+ num.getNumero2());
    }
    
}
