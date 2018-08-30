/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainletras;

/**
 *
 * @author Santi Duque
 */
import java.util.Scanner;

public class MainLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String vehiculo;
        
        Scanner vh = new Scanner(System.in);
        System.out.println("Ingrese el medio: \n");
        vehiculo = vh.nextLine();
        
       abcMeta medio = new abcMeta(vehiculo);
       
        if ("moto".equals(medio.getMedio())) {
            medio.Detener();
            System.out.println("::Se quedo sin gasolina::");
        }else
            System.out.println("Mensaje: seguir");
    }
    
}
