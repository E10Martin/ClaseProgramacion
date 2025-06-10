package dto;

import com.mysql.cj.xdevapi.Schema;
import database.DBConnection;
import database.ShemaDB;
import model.Profesor;

import java.sql.*;

public class ProfesoresDTO {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;
    public static Profesor profesor;

    public  void insertarProfe(Profesor profesor){
        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();
            String query = "INSERT INTO %s (%s,%s,%s ) VALUES ('%s','%s','%d')";
            String queryFormateada = String.format(query, ShemaDB.TAB_NAME,
                    ShemaDB.COL_NOMBRE, ShemaDB.COL_DNI, ShemaDB.COL_SALARIO, profesor.getNombre(), profesor.getDNI(), profesor.getSalarioAnual() );
            statement.execute(queryFormateada);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void eliminarTrabajador(int dni){
        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();
            String query = "DELETE FROM %s WHERE %s = '%d'";
            String queryFormatedada = String.format(query, ShemaDB.TAB_NAME,
                    ShemaDB.COL_DNI, dni);
            int filas = statement.executeUpdate(queryFormatedada);
            if (filas > 0){
                System.out.println("Trabajador eliminado");
            } else {
                System.out.println("No se encontro nigun trabajador");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
