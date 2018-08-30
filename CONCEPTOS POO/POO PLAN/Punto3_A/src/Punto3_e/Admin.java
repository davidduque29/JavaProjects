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
public class Admin extends Usuarios {
    
    public Admin(String nombre, String apellido, String cargo, String email, int idUsuario, int contraseña) {
        super(nombre, apellido, cargo, email, idUsuario, contraseña);
    }
    
    public int RegistrarUsuario(int usuario){
    
        return usuario;
    }
    
}
