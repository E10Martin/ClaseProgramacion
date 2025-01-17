package ejer3.entrada;

import ejer3.controller.Alumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Alumnos> listaalumnos = new ArrayList<>();
        Alumnos alumnos = new Alumnos();


        int opcion;
        do {
            System.out.println("1. Agregar persona.");
            System.out.println("2. Buscar persona.");
            System.out.println("3. Borrar persona.");
            System.out.println("4. Borrar sin disponibilidad.");
            System.out.println("5. Listar persona.");
            System.out.println("6. Salir.");
            System.out.print("Elige una opcion:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Telefono: ");
                    String telefono = scanner.next();
                    System.out.print("DNI: ");
                    String dni = scanner.next();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while (opcion !=6);
    }
}
