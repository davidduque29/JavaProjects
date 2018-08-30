/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfiguraregular;

import java.util.Scanner;

/**
 *
 * @author Santi Duque
 */
public class mainFiguraRegular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       int numLado;
       int area = 0;
       
       figuraRegular fg1 = new figuraRegular(2);
       System.out.println("::: Area de Figuras :::");
       area= fg1.verArea(fg1.getLado());
        System.out.println("El area de la figura es: "+area+"\n ::::::::::::::::::::::::::");
        
       Scanner lado = new Scanner(System.in);
       System.out.println("Ingrese numero de lados de la figura: \n");
       num = lado.nextInt();
        
       figuraRegular fg2 = new figuraRegular(num);
       area= fg2.verArea(fg2.getLado());
       System.out.println("El area de la figura es: "+area+"\n ::::::::::::::::::::::::::");
    }
    
}
