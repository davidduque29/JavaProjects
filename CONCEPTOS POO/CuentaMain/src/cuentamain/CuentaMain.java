/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentamain;

import java.util.ArrayList;
import java.util.Scanner;



public class CuentaMain {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Scanner leer = new Scanner(System.in);
        String nom, key;
        String nomAct="id";
        String keyAct="123";
        String opc="1";
        int registros=0;
        
        
        
        do {
            
        System.out.println("::: SISTEMA :::\n");
        
            do {
                System.out.println("Por favor escriba su  nombre: \n");
                nom=leer.nextLine();
                
                if (nom.equals(nomAct)) {
                System.out.println(":: Nombre correcto ::");
            }else{System.out.println("(xx Nombre incorrecto xx)");}
                
            } while (nom.equals(nomAct));
            // si (nom.equals(nomAct))- se repite
            // si (!nom.equals(nomAct))- se va a repetir siempre que 
            // nom diferente de nomActual
            //!nom.equals(nomAct si nombre es diferente del actual se repite
            
        
            
        
        System.out.println("Por favor escriba su  clave: \n");
        key=leer.nextLine();
               if (key.equals(keyAct)) {
                System.out.println(":: clave correcta ::");
            }else{ System.out.println("xx clave incorrecta xx");}
        
            cuenta.getUsuarios().add(new Usuario(nom));
            cuenta.getUsuarios().get(0).getListaClave().add(key);
            

          registros=registros+1;
          System.out.println("____________________________");
          System.out.println("Veces de Registro: "+ registros);
          System.out.println("____________________________");
        
            System.out.println("Desea volver a ingresar:\n"
                    + "presione (1) sino (0)");
            opc=leer.nextLine();
            
          
            
        } while (opc.equals("1"));
        
        
    }
    
}
