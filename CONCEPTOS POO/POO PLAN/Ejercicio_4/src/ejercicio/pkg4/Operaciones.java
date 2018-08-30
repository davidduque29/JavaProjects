package ejercicio.pkg4;

import java.util.Scanner;

public class Operaciones {

    Scanner leer = new Scanner(System.in);
    public int cantidad;
    public String curso[][] = new String[11][7];
    public String alumno[][] = new String[11][6];

    public void inscribirAlumno() {
        alumno[0][0] = "cedula";
        alumno[0][1] = "Apellido";
        alumno[0][2] = "Nombre";
        alumno[0][3] = "Direccion";
        alumno[0][4] = "Telefono";
        alumno[0][5] = "Ocupacion";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Ingrese  " + alumno[0][j] + ":");
                alumno[i][j] = leer.next();
            }
            break;
        }
    }

    public void inscribirCurso() {
        curso[0][0] = "Nombre curso";
        curso[0][1] = "Contenido";
        curso[0][2] = "Duracion";
        curso[0][3] = "Nivel";
        curso[0][4] = "Fecha inicio";
        curso[0][5] = "Fecha fin";
        curso[0][6] = "Precio";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Ingrese  " + curso[0][j] + ":");
                curso[i][j] = leer.next();
            }
            break;
        }
    }

    public void mostrarCursos() {
        curso[0][0] = "Nombre curso";
        curso[0][1] = "Contenido";
        curso[0][2] = "Duracion";
        curso[0][3] = "Nivel";
        curso[0][4] = "Fecha inicio";
        curso[0][5] = "Fecha fin";
        curso[0][6] = "Precio";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(curso[i][j] + " \t ");
            }
            System.out.println("");
        }
    }
    public void mostrarAlumno() {
        alumno[0][0] = "cedula";
        alumno[0][1] = "Apellido";
        alumno[0][2] = "Nombre";
        alumno[0][3] = "Direccion";
        alumno[0][4] = "Telefono";
        alumno[0][5] = "Ocupacion";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Ingrese  " + curso[0][j] + ":");
                curso[i][j] = leer.next();
            }
        }
    }
}
