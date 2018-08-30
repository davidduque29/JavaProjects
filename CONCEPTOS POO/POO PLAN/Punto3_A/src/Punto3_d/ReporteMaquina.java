/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_d;

/**
 *
 * @author ivandavid
 */
public class ReporteMaquina {
    private String nombre;
    private String modelo;
    private String tipo;
    private String novedad;
    

    public ReporteMaquina(String nombre, String modelo, String tipo, String novedad) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.tipo = tipo;
        this.novedad = novedad;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }
}
