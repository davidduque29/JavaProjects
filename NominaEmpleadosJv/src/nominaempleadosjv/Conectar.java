/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominaempleadosjv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SantiDuque
 */
public class Conectar {

    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "123456"; //127.0.0.1
    private static final String url = "jdbc:mysql://127.0.0.1:3306/agendadigital";

    public Conectar() {
        conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println(":: Conexion establecida ::");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectarse \n" + e);
        }
    }
// metodo retorna la conexion

    public Connection getConnection() {
        return conn;
    }

    // metodo desconecta de la base de datos
    public void desconectar() {
        conn = null;
        if (conn == null) {
            System.out.println("xx Conexion terminada xx");
        }
    }

}
