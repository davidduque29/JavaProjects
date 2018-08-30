/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfiguraregular;

/**
 *
 * @author Santi Duque
 */
public class figuraRegular {
  private int lado;
  private int area;

    public figuraRegular(int lado) {
        this.lado = lado;
    }
    public int verArea(int lado){
        area = 0;
        area = lado*lado;
        return area;
    }
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    } 
  
}
