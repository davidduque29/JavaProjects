/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author nelson
 */
public class Main {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        Materia materia = new Materia("Matematicas");
        Scanner in = new Scanner(System.in);
        double numero;
//        do{
//            System.out.println("Ingrese la nota (-1 para terminar)");
//            numero = in.nextDouble();
//            materia.agregarNota(numero);
//        } while(numero!=-1);
//        
        for (int i=0;i<5;i++){
          System.out.println("Ingrese la "+(i+1)+" nota");
            numero = in.nextDouble();
            materia.agregarNota(numero);  
        }
        

        System.out.println("promedio: "+df.format(materia.promedio()));
        System.out.println("nota mas baja: "+ df.format(materia.notaMasBaja()));
        System.out.println("nota mas alta: "+ df.format(materia.notaMasAlta()));
        
    }
}
