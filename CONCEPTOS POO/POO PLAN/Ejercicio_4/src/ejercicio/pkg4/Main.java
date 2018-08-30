package ejercicio.pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones Ops = new Operaciones();
        int opcion, menu = 0;
        do {
            System.out.println("Bienvenido ");
            System.out.println("1. Inscribir curso");
            System.out.println("2. Inscribir alumno");
            System.out.println("3. Ver cursos");
            System.out.println("4. Ver alumnos");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Ops.inscribirCurso();
                    System.out.println("Desea volver al menu principal, presione (1) de lo contrario"
                            + "\nPresione otra tecla");
                    menu = leer.nextInt();
                    break;
                case 2:
                    Ops.inscribirAlumno();
                    System.out.println("Desea volver al menu principal, presione (1) de lo contrario"
                            + "\nPresione otra tecla");
                    menu = leer.nextInt();

                    break;
                case 3:
                    Ops.mostrarCursos();
                    System.out.println("Desea volver al menu principal, presione (1) de lo contrario"
                            + "\nPresione otra tecla");
                    menu = leer.nextInt();

                    break;
                case 4:
                    Ops.inscribirAlumno();
                    System.out.println("Desea volver al menu principal, presione (1) de lo contrario"
                            + "\nPresione otra tecla");
                    menu = leer.nextInt();

                    break;
            }
        } while (menu == 1);
    }

}
