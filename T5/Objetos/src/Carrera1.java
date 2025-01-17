import model.Coche1;

import java.util.ArrayList;
import java.util.Scanner;


public class Carrera1 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Coche1> listaCoches1 = new ArrayList<>(6);
        int opcion;
        do {
            System.out.println("1. Introduce el coche");
            System.out.println("");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
            }
        } while (opcion !=2);
    }
}
