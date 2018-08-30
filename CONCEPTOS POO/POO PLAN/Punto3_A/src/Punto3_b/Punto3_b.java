/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_b;

import java.util.Scanner;

public class Punto3_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("::: PUNTO 3 - B.INSTANCIA :::\n");
        
        System.out.println("-Registro de Usuarios-\n");
        
        Scanner leer = new Scanner(System.in);
        int cedula, telefono;
        String nombre;
        String apellido;
        String direccion;
        
        RegistrarUsuarios reg = new RegistrarUsuarios(0,0,"","","");
        
        
        System.out.println("Ingrese nombre: \n");
        nombre=leer.nextLine();
        
        System.out.println("Ingrese apellido: \n");
        apellido=leer.nextLine();       
        
        System.out.println("Ingrese direccion: \n");
        direccion=leer.nextLine();
        
        System.out.println("Ingrese cedula: \n");
        cedula=leer.nextInt();
        
        System.out.println("Ingrese telefono: \n");
        telefono=leer.nextInt();
        
       
        
        //mensajes
        reg.setCedula(cedula);
        reg.setTelefono(telefono);
        reg.setNombre(nombre);
        reg.setApellido(apellido);
        reg.setDireccion(direccion);
        System.out.println(":: USURIO REGISTRADO ::\n");
        System.out.println("* cedula: "+ reg.getCedula()+" nombre: "+reg.getNombre()
                +" apellido: "+ reg.getApellido()+" direccion: "+ reg.getDireccion()
                +" telefono: "+ reg.getTelefono());
    }
    
}
