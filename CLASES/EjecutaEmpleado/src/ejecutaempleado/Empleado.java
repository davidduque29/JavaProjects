/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutaempleado;

/**
 *
 * @author ivandavid
 */
public class Empleado {
    private String nombreEmpleado;
    private int horas;
    private int cuotas;

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }


    
     public int  CalcularSueldo(){
                
        int sueldo;
        
        sueldo=horas*cuotas;
        
         System.out.println("\n *El valor del sueldo es: $ "+sueldo);
         
    return sueldo;
}
}
