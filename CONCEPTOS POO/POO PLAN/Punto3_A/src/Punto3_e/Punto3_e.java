/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_e;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author ivandavid
 */
public class Punto3_e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int repetir=0;
         do {
                
        System.out.println(":: PUNTO 3 - E.HERENCIA ::\n");
        System.out.println("-Listar Usuarios-\n");
        
        try{
        int opcion;
        
        System.out.println("Digite la opcion a listar:\n -1.Administrador\n -2.Gestor");
        opcion=leer.nextInt();
        System.out.println("\n");
        
        if (opcion == 1) {
              
            Admin adm = new Admin("Ivan","Duque","Administrador","ivduque@",1111,1054);
            Admin adm2 = new Admin("ela","Velden","Administradora","ela@",1222,1053);

            ArrayList<Admin> personas = new ArrayList<Admin>();

            personas.add(adm);
            personas.add(adm2);
            
            System.out.println("__________________________\nLISTADO ADMINISTRADORES\n");
            for(Admin usu:personas){
                System.out.println("usuarios: "+usu);

            }
       }// fin opcion 1
        else if(opcion == 2){
            GestorCalidad gec = new GestorCalidad("linda","Velden","GestorCalidad","liv@",1232,1052);
            GestorCalidad gec2 = new GestorCalidad("linda","Velden","GestorCalidad","liv@",1232,1052);
            
            ArrayList<GestorCalidad> gestor= new ArrayList<GestorCalidad>();

            gestor.add(gec);
            gestor.add(gec2);
            
            System.out.println("__________________________\nLISTADO GESTORES\n");
            for(GestorCalidad gest:gestor){
                System.out.println(" Gestor: "+ gest);
            }
         }//fin opcion 2
        else{
        }// fin else
             System.out.println("(Para repetir digite[1])");
             System.out.println("(sino cualquier tecla)");
             repetir=leer.nextInt();
              }catch(InputMismatchException e){
                  e.printStackTrace();
            //System.out.println("¡¡solo numeros");
        }finally {
            System.out.println("proceso terminado....");
        }  
      } while (repetir == 1);
    }// fin args       
  }// fin clase
    

