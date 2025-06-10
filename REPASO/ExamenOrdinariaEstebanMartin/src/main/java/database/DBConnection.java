package database;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/tienda_ces";
    private static final String ROOT = "root";
    private static final String PASS = "r00tSQLito";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null){
            createConnection();
            System.out.println("Conexion con exito");
        }
        return connection;
    }

    public static void  createConnection(){
        try {
            connection = DriverManager.getConnection(URL, ROOT, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
