package ejercicio32;

import java.util.Scanner;

public class dateUsuarios {

    private String nombreUsuario = "admin";
    private String contraseña = "1234";
    private Scanner leer = new Scanner(System.in);
    private String us;
    private String con;
    int n = 5;
    String arr[] = new String[5];

    public void validacion() {
        System.out.println("Ingrese Usuario: ");
        us = leer.next();
        System.out.println("Ingrese Contraseña: ");
        con = leer.next();

        if (us.equalsIgnoreCase(nombreUsuario) && con.equalsIgnoreCase(contraseña)) {
            System.out.println("Bienvenido " + nombreUsuario);
        } else {
            System.out.println("Datos incorrectos");
        }
    }

    public void cambiarContraseña() {
        System.out.println("Ingrese Contrseña antigua:");
        con = leer.next();

        if (con.equalsIgnoreCase(contraseña)) {
            System.out.println("Ingrese Contraseña Nueva: ");
            con = leer.next();
            for (int i = 1; i <= n - 1; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = con;
            contraseña = con;
        }
        System.out.println("contraseñas" + contraseña);
        for (int i = 1; i <= n - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public void operaciones() {
        int salir;
        arr[4] = "1234";
        do {
            System.out.println("Selecciones la Opcion deseada: 1 iniciar sesion 2 cambiar contraseña ");
            salir = leer.nextInt();

            switch (salir) {
                case 1:
                    System.out.println("Ingrese Usuario: ");
                    us = leer.next();
                    System.out.println("Ingrese Contraseña: ");
                    con = leer.next();

                    if (us.equalsIgnoreCase(nombreUsuario) && con.equalsIgnoreCase(contraseña)) {
                        System.out.println("Bienvenido " + nombreUsuario);
                    } else {
                        System.out.println("Datos incorrectos");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese Contrseña antigua:");
                    con = leer.next();

                    if (con.equalsIgnoreCase(contraseña)) {

                        System.out.println("Ingrese Contraseña Nueva: ");
                        con = leer.next();

                        for (int i = 1; i <= n - 1; i++) {
                            if (con.equalsIgnoreCase(arr[i])) {
                                do {
                                    System.out.println("Contraseña usada recientemente");
                                    System.out.println("Ingrese Contraseña Nueva: ");
                                    con = leer.next();
                                } while (con.endsWith(arr[i]));
                            }
                        }

                        for (int i = 1; i <= n - 1; i++) {
                            arr[i - 1] = arr[i];
                        }
                        arr[n - 1] = con;
                        contraseña = con;
                        System.out.println("contraseñas");
                        for (int i = 1; i <= n - 1; i++) {
                            System.out.println(arr[i]);
                        }
                    } else {
                        System.out.println("Datos Incorrectos");
                    }
                    break;
            }

        } while (true);

    }
}
