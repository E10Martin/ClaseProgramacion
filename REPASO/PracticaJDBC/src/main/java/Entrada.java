import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("1. Agregar coche");
            System.out.println("2. Borrar coche por id");
            System.out.println("3. Consultar el  coche por id");
            System.out.println("4. Listado de coches");
            System.out.println("5. Terminar el  programa");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.print("Saliendo...");
                    break;

            }
        } while (opcion != 5);
    }
}
