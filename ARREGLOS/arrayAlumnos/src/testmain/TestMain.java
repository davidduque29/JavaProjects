/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmain;

import java.util.Scanner;


public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner n = new Scanner (System.in);
        
        String nombre, tarjeta;
        
        System.out.println("Escriba su nombre:"); 
        nombre=n.nextLine();
        
        System.out.println("Escriba su tarjeta:"); 
        tarjeta=n.nextLine();
        
        Curso c = new Curso();
        for (int i = 0; i < 10; i++) {
        Alumno a1 = new Alumno(nombre+i,tarjeta+i);
        c.adAlumnos(a1);
        a1.getListMater().add(new Materia("ingles"));

        }
        c.mostrarAlm();            
    }
    
}
