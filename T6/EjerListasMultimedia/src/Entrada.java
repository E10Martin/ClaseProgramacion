import model.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
    Persona persona = new Persona();
        ArrayList<Persona> actores = new ArrayList<>();
        do {
            System.out.println("1. Agregar persona");
            System.out.println("Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre");
                    String nombre = scanner.next();
                    System.out.println("DNI");
                    String dni = scanner.next();
                    actores.add(new Persona(nombre, dni));
                    System.out.println("Mostrando los datos obtenidos");
                    persona.mostrarDatos();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 2);
    }
}
