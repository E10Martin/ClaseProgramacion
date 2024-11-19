import java.util.Scanner;

public class Ejer4 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] usuarios = new String[10][4];
        int contador = 0;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona por DNI");
            System.out.println("3. Listar personas");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    if (contador >= 10) {
                        System.out.println("La lista está llena. No se pueden agregar más personas.");
                    } else {
                        System.out.print("Ingrese nombre: ");
                        usuarios[contador][0] = teclado.next();

                        System.out.print("Ingrese apellido: ");
                        usuarios[contador][1] = teclado.next();

                        System.out.print("Ingrese teléfono: ");
                        usuarios[contador][2] = teclado.next();

                        System.out.print("Ingrese DNI: ");
                        usuarios[contador][3] = teclado.next();

                        System.out.println("Persona agregada con éxito.");
                        contador++;
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el DNI a buscar: ");
                    String dniBuscado = teclado.next();
                    boolean encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (usuarios[i][3].equals(dniBuscado)) {
                            System.out.println("Persona encontrada:");
                            System.out.println("Nombre: " + usuarios[i][0] + ", Apellido: " + usuarios[i][1] +
                                    ", Teléfono: " + usuarios[i][2]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró ninguna persona.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de personas registradas:");
                    if (contador == 0) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Nombre: " + usuarios[i][0] + ", Apellido: " + usuarios[i][1] +
                                    ", Teléfono: " + usuarios[i][2] + ", DNI: " + usuarios[i][3]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
