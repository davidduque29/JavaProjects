/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3_g;

import java.util.ArrayList;

public class Maquina {
    private String codMaquina;
    private String nombre;
    private String tipo;
    private ArrayList<Maquina> listaMaquinas;

    public Maquina(String codMaquina, String nombre, String tipo) {
        this.codMaquina = codMaquina;
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaMaquinas=new ArrayList<>();
    }
    public void agregarMaquina(Maquina maq){
        listaMaquinas.add( maq);
    }
    public void mostrarMaquina(){
        for (Maquina listaMaq : listaMaquinas) {
            System.out.println("Maquina: "+ listaMaq);
        }
    }

    public ArrayList<Maquina> getListaMaquinas() {
        return listaMaquinas;
    }

    public void setListaMaquinas(ArrayList<Maquina> listaMaquinas) {
        this.listaMaquinas = listaMaquinas;
    }
    
    
    public String getCodMaquina() {
        return codMaquina;
    }

    public void setCodMaquina(String codMaquina) {
        this.codMaquina = codMaquina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Maquina{" + "codMaquina=" + codMaquina + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
}
