/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3_f;

/**
 *
 * @author ivandavid
 */
public class punto3_f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProcesoProduccion process = new ProcesoProduccion("EMP123", "EMPAQUETAR");
//        ProcesoProduccion proInt = new ProcesoProduccion(123, "EMPAQUETAR");
        
        process.añadirProceso(process);
//        process.mostrarProceso();
        
       /* pro.añadirProceso(proInt);
        proInt.mostrarProceso();*/
    }
    
}
