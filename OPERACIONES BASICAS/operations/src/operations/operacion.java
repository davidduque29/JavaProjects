/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;



import java.util.Scanner;

public class operacion {
    private int num1, num2;

    public operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void operaciones (){
        Scanner leer = new Scanner(System.in);
        int oper;
        int opcion=0;
        System.out.println("1.Digite el num de la operacion: \n"); 
        System.out.println("1.suma\n 2.Resta\n");
        opcion=leer.nextInt();
        System.out.println("");
        
                oper= suma(num1, num2);
                 System.out.println("resul de la suma(+): "+oper);
        
    }
    public int suma (int nume1, int nume2){
        
        int suma;
        
        suma= nume1+nume2;
    
        return suma;
    }
      public int resta (int nume1, int nume2){
        
        int resta;
        
        resta= nume1-nume2;
    
        return resta;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
