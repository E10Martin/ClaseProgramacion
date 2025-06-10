import controller.Tienda;

import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Connection connection = DBConnection.getConnection();
        Tienda tienda = new Tienda();
        int opcion;

        do {
            System.out.println();
            System.out.println("1. Actualizar por id");
            System.out.println("2. Insertar producto");
            System.out.println("3. Mostrar por id");
            System.out.println("4. Actualizar por id");
            System.out.println("5. Eliminar por id");
            System.out.println("6. Mostrar todos los productos");
            System.out.println("7. Salir");
            System.out.println("Elige una opcion; ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    tienda.productosCSV();
                    break;
                case 2:
                    tienda.menuInsertar();
                    break;
                case 3:
                    tienda.mostrarProducto();
                    break;
                case 4:
                    tienda.actualizarProducto();
                    break;
                case 5:
                    tienda.menuEsliminar();
                    break;
                case 6:
                    tienda.menuTienda();
                    break;
                case 7:
                    System.out.println("Saliendo... ");
                    break;
            }
        } while (opcion != 7);
    }
}
