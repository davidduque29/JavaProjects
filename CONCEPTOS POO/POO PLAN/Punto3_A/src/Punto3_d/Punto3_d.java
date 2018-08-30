/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_d;

import java.util.Scanner;

public class Punto3_d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("::: PUNTO 3 - D.Encapsulamiento :::\n");
        
        System.out.println("-Reporte maquina-\n");
        
        String nombre, modelo, tipo, novedad;
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingresar nombre: ");
        nombre=leer.nextLine();
        System.out.println("\n");
        
        System.out.println("Ingresar modelo: ");
        modelo=leer.nextLine();
        System.out.println("\n");
        
        System.out.println("Ingresar tipo: ");
        tipo=leer.nextLine();
        System.out.println("\n");
        
        System.out.println("Ingresar novedad: ");
        novedad=leer.nextLine();
        System.out.println("\n");
        
        ReporteMaquina report = new ReporteMaquina("","","","");
        
        report.setNombre(nombre);
        report.setModelo(modelo);
        report.setTipo(tipo);
        report.setNovedad(novedad);
        
        System.out.println("::: REPORTE :::\n");
        System.out.println("-Maquina: "+ report.getNombre()+"\n -Modelo: "+report.getModelo()
        +"\n -Tipo: "+report.getTipo()+"\n -Novedad: "+report.getNovedad());
    }
    
}
