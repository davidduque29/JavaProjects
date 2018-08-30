/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaseguridad;

/**
 *
 * @author ivandavid
 */
public class Usuarios {
private String usuario;
    private String[] contrasena;
    private int[] conteo;
    int contador ;

    public Usuarios(int[] conteo) {
        this.conteo = conteo;
    }

    public int[] getConteo() {
        return conteo;
    }

    public Usuarios(String usuario, String contrasena) {

        this.usuario = usuario;
        this.contrasena = new String[4];
        this.contrasena[0] = contrasena;
        this.contrasena[1] = "abc123";
        this.contrasena[2] = "abc456";
        this.contrasena[3] = "abc789";

    }

    public boolean validarIngreso(String usuarioIngresado, String contrasenaIngresada) {

        boolean usuarioCorrecto = false;
        boolean contrasenaCorrecta = false;

        if (usuarioIngresado.equals(this.usuario)) {

            usuarioCorrecto = true;
        }

        if (contrasenaIngresada.equals(this.contrasena[0])) {

            contrasenaCorrecta = true;
        }

        if (usuarioCorrecto && contrasenaCorrecta) {
            System.out.println();
            System.out.println("Bienvenido " + this.usuario);

            return true;
        } else {
            System.out.println("El usuario o contraseña son incorrectos");
            return false;
        }

    }

    public void cambiarContrasena(String nuevaContrasena) {

        boolean encontrado = false;

        for (int i = 0; i < this.contrasena.length; i++) {
            if (this.contrasena[i].equals(nuevaContrasena)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Su nueva contraseña ya fue utilizada");
        } else {
            this.contrasena[1] = this.contrasena[0];
            this.contrasena[2] = this.contrasena[1];
            this.contrasena[3] = this.contrasena[2];
            this.contrasena[0] = nuevaContrasena;

            System.out.println("Su contraseña fue cambiada correctamente");
        }

    }

//    public int CantidadIngresos(int conteo) {
//
//        int contar = 0;
//
//        if (validarIngreso(usuario, contrasena[0])) {
//            System.out.println();
//            contar = contar + 1;
//
//        }
//        return contar;
//    }

    public int CantidadIngresos(boolean usuarioIngresado) {

        if (usuarioIngresado) {
           
            contador = contador + 1;
        }
        return contador;
    }
}
