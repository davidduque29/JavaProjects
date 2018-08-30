/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ivandavid
 */
public class JavaApplication80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList Lista = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            Lista.add("Se repite :" + i);
            JOptionPane.showMessageDialog(null, Lista.get(i));
        }
        
    }
    
}
