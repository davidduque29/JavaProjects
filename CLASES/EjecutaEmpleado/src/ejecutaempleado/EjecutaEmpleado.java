/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutaempleado;

import java.util.Scanner;

public class EjecutaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre;
        int cuota, horas;
        
        
        System.out.println("\n Por favor ingrese el nombre");
        nombre=leer.nextLine();
        
          System.out.println("\n Por favor ingrese el numero de horas");
        horas=leer.nextInt();
        
           System.out.println("\n Por favor ingrese el valor de la cuota");
        cuota=leer.nextInt();

       Empleado objetoE= new Empleado ();
       objetoE.setNombreEmpleado(nombre);
        System.out.println("\n Nombre: "+objetoE.getNombreEmpleado());

       objetoE.setHoras(horas);
        System.out.println("\n Cantidad horas: "+objetoE.getHoras());

       objetoE.setCuotas(cuota);
        System.out.println("\n Valor cuota: "+objetoE.getCuotas());
        
        objetoE.CalcularSueldo();
    }

}
