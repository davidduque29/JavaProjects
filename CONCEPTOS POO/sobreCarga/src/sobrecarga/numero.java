/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author ivandavid
 */
public class numero {
    private int numero;
    private double numero2;
    
    public void numero(int num){
        this.numero=num;
        this.numero2=num;
    }
    public void set (int num){
        numero=num;
    }
    public void set (double num){
        numero2=num;
    }
    public int getNumero(){
      return numero;
    }
    public double getNumero2 (){
      return numero2;
    }
}
