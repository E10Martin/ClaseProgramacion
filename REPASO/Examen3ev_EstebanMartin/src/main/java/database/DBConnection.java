package database;

import java.sql.*;

public class DBConnection {

    private final  static String URL = "jdbc:mysql://localhost:3306/profesores_ces";
    private final static String ROOT = "root";
    private final static String PASS = "r00tSQLito";

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null){
            createConnection();
            System.out.println("Conexion hecha con exito");
        }
        return connection;
    }

    public static void createConnection(){
        try {
            connection = DriverManager.getConnection(URL, ROOT, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
