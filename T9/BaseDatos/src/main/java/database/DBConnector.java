package database;

import java.sql.*;


public class DBConnector {
    private static Connection connection;

    public static Connection getConnection(){
        if(connection==null){

        }

        return connection;
    }

    public static void createConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_ces","root","r00tSQLito");
        } catch (SQLException e) {
            System.out.println("Error en algo");
            System.out.println(e.getMessage());
        }
    }
}
