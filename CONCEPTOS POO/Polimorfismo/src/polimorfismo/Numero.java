/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author ivandavid
 */
public class Numero {
    private int numero1=0;
    private double numero2=0;
    
    // 1.existes dos metodos con el mismo nombre, entonces segun el dato que se envia
    // en el main, java decide que metodo utilizar
    public void set (int num){
        numero1=num;
    }
    public void set(double num){
        numero2=num;
    }

    public int getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    public void set (int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
}
