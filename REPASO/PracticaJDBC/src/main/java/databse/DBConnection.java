package databse;

import java.sql.*;

public class DBConnection {

   private static Connection connection;

    public static Connection getConnection() {
        if (connection==null){
            createConnection();
        }
        return connection;
    }
    public static void createConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql//localhost:3306/pasajeros_ces");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
