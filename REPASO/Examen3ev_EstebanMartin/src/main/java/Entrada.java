import controller.CentroFormacion;
import database.DBConnection;

import java.sql.Connection;
import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        Connection connection;
        //dbConnection.getConnection();
        int opcion;

        do {
            CentroFormacion centroFormacion = new CentroFormacion();
            System.out.println("1. Insertar profe");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    centroFormacion.menuInsertar();
                    break;
                case 2:
                    centroFormacion.eliminar();
                    break;
                case 5:
                    System.out.println("Saliendo... ");
                    break;
            }
        } while (opcion != 5);
    }
}
