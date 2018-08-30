/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainletras;
/**
Super clase
 */
public abstract class abc {
    private String medio;
    
    public abc(String medio){
        this.medio = medio;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }  
    abstract public void Avanzar();
    abstract public void girarDerecha();
    abstract public void girarIzquierda();
    abstract public void Detener();
    
    public void verDatos(){
        System.out.println("datos");
    };
    
}
