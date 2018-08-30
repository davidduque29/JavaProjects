/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_e;

/**
 *
 * @author ivandavid
 */
public class Usuarios {
    private String nombre;
    private String apellido;
    private String cargo;
    private String email;
    private int idUsuario;
    private int contraseña;

    public Usuarios(String nombre, String apellido, String cargo, String email, int idUsuario, int contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.email = email;
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    } 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", email=" + email + ", idUsuario=" + idUsuario + ", contrase\u00f1a=" + contraseña + '}'+"\n";
    }
    
    
}
