package model;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Inventario inventario = new Inventario<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre");
            String nombre = scanner.next();
            System.out.println("Precio");
            double precio = scanner.nextDouble();
            System.out.println("stock");
            int stock = scanner.nextInt();

            inventario.anadirElemento(new Inventario<>());
        }

        System.out.println();

        inventario.toString();
    }
}
