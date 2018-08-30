/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridaddb;
import java.util.Scanner;

/**
 *
 * @author ivandavid
 */
public class SeguridadDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String usu;
        int clave=0;
        
        System.out.println("::::: Bienvenido a DATABASE CENTER ::::: \n");
        
        do {
            
        
        
        System.out.println("Por favor ingrese su usuario: \n");
        usu=leer.nextLine();
        System.out.println("");
        
        if (usu != "user"){
                    System.out.println("!!!!Error de usuario!!! \n");
                }else{
        }
        } while (usu != "user");
        
        System.out.println("Por favor ingrese su clave: \n");
        clave=leer.nextInt();
        System.out.println("");
        
        if (clave != 1234) {
            System.out.println("!!!!Error de contraseña!!! \n");
            
   
        }else{
            System.out.println("··Bienvenido administrador·· \n");
            
        }
    }
      
}
