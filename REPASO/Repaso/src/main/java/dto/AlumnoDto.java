package dto;

import database.DBConnection;
import model.Alumno;

import java.sql.*;

public class AlumnoDto {

    //necesito poder llegar a la bd para ejecutar acciones

    private Connection connection;

    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet resultSet;

    public void insertarUsuario(Alumno alumno){
        connection = DBConnection.getConnection();
        String query = String.format("INSERT into %s (%s,%s,%s) VALUES (?,?,?)","alumno","nombre","apellido", "correo");

            try {
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, alumno.getNombre());
                preparedStatement.setString(2, alumno.getApellido());
                preparedStatement.setString(2, alumno.getApellido());
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    public void getUsuarios(){
        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM alumnos");

            while (resultSet.next()){
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String correo = resultSet.getString("correo");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void getUsuariosByCorreo(String correo){

    }
    public void getUsuarioById(int id){

    }
}
