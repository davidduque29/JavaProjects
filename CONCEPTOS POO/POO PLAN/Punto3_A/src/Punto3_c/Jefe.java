/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_c;

import javax.swing.JOptionPane;

/**
 *
 * @author ivandavid
 */
public class Jefe extends Usuario{
    String accion;

    public Jefe(String accion, int codUsuario, String nombre, String cargo, String contraseña) {
        super(codUsuario, nombre, cargo, contraseña);
        this.accion = accion;
    }

    @Override
    public void verDatos() {
           JOptionPane.showMessageDialog(null, "DATOS USUARIO \n" + "\n id_Usuario: "+ codUsuario + "\n  Nombre: " + nombre +
           "\n  Cargo: " + cargo + "\n Accion: "+ accion  +"\n  Contraseña: " + contraseña);
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
