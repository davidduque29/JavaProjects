/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author ivandavid
 */
public class SobreCarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        numero number = new numero();
        
        number.set(5.2);
        
        System.out.println("num: "+ number.getNumero2()+" num "+number.getNumero());
        
        
        
    }
    
}
