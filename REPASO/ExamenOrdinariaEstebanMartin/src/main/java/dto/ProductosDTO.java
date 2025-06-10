package dto;

import database.DBConnection;
import database.SchemaDB;
import model.Productos;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ProductosDTO {

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;

    public ProductosDTO(){
        connection = DBConnection.getConnection();
    }
    public void insertarProductosDecimal(Productos productos){
        connection = DBConnection.getConnection();

        try {
            statement = connection.createStatement();

            String query = "INSERT INTO %s(%s, %s, %s, %s) VALUES ('%d','%s','%.1f','%d')";
            String queryFormateada = String.format(query, SchemaDB.TAB_NAME,
                    SchemaDB.COL_ID, SchemaDB.COL_NOMBRE, SchemaDB.COL_PRECIO, SchemaDB.COL_CANTIDAD,
                    productos.getId(), productos.getNombre(), productos.getPrecio(), productos.getCantidad());
            statement.execute(queryFormateada);
            System.out.println("Producto añadido");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertarProductos(Productos productos){
        connection = DBConnection.getConnection();

        try {
            statement = connection.createStatement();

            String query = "INSERT INTO %s(%s, %s, %s, %s) VALUES ('%d','%s','%d','%d')";
            String queryFormateada = String.format(query, SchemaDB.TAB_NAME,
                    SchemaDB.COL_ID, SchemaDB.COL_NOMBRE, SchemaDB.COL_PRECIO, SchemaDB.COL_CANTIDAD,
                    productos.getId(), productos.getNombre(), productos.getPrecio(), productos.getCantidad());
            statement.execute(queryFormateada);
            System.out.println("Producto añadido");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminarProductos(int id){
        connection = DBConnection.getConnection();

        try {
            statement = connection.createStatement();

            String query = "DELETE FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query, SchemaDB.TAB_NAME,
                    SchemaDB.COL_ID,
                    id);
            int filas = statement.executeUpdate(queryFormateada);
            if (filas >0){
                System.out.println("Producto eliminado");
            }else {
                System.out.println("No hay ningun producto con ese id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Productos mostrarProducto(int id){
        connection = DBConnection.getConnection();
        Productos productos = null;
        try {
            statement = connection.createStatement();

            String query = "SELECT * FROM %s WHERE %s = %d";
            String queryFormateada = String.format(query, SchemaDB.TAB_NAME,
                    SchemaDB.COL_ID,
                    id);
            resultSet = statement.executeQuery(queryFormateada);

            if (resultSet.next()){
                productos = new Productos(
                        resultSet.getInt(SchemaDB.COL_ID),
                        resultSet.getString(SchemaDB.COL_NOMBRE),
                        resultSet.getInt(SchemaDB.COL_PRECIO),
                        resultSet.getInt(SchemaDB.COL_CANTIDAD)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }

    public void mostrarTienda(){
        connection = DBConnection.getConnection();
        try {
            statement = connection.createStatement();

            String query = "SELECT * FROM %s";
            String queryFormateada = String.format(query, SchemaDB.TAB_NAME);
            resultSet = statement.executeQuery(queryFormateada);

            while (resultSet.next()){
                System.out.printf(String.format("id = %d |nombre = %s |precio = %d |cantidad = %d |\n",
                        resultSet.getInt(SchemaDB.COL_ID),
                        resultSet.getString(SchemaDB.COL_NOMBRE),
                        resultSet.getInt(SchemaDB.COL_PRECIO),
                        resultSet.getInt(SchemaDB.COL_CANTIDAD)
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarProducto(int id){
        String query = "UPDATE productos SET nombre=%s, descripcion=%s, precio=%s, stock=%s WHERE id=%s";
        String queryFOrmateada;

    }



}
