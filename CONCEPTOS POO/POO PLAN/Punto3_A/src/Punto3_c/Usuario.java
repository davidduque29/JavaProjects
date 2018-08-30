/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_c;

/**
 *
 * @author ivandavid
 */
public abstract class Usuario {
    int codUsuario;
    String nombre;
    String cargo;
    String contraseña;

    public Usuario(int codUsuario, String nombre, String cargo, String contraseña) {
        this.codUsuario = codUsuario;
        this.nombre = nombre;
        this.cargo = cargo;
        this.contraseña = contraseña;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
     abstract public void verDatos();  
}
