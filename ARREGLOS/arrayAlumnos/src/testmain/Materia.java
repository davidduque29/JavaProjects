/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmain;

/**
 *
 * @author ivandavid
 */
public class Materia {
    private String materia;

    public Materia(String materia) {
        this.materia = materia;
    }

    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Materia{" + "materia=" + materia + '}';
    }
    
    
}
