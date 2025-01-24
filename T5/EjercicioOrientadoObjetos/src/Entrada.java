import model.Persona;

import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Introduce la persona");
            System.out.println("salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Nombre");
                    String nombre = scanner.next();
                    System.out.println("Apellido");
                    String apellido = scanner.next();
                    System.out.println("DNI");
                    String dni = scanner.next();
                    System.out.println("Edad");
                    int edad = scanner.nextInt();
                    System.out.println("Altura");
                    double altura = scanner.nextDouble();
                    System.out.println("Peso");
                    double peso = scanner.nextDouble();
                    Persona persona1 = new Persona(nombre, apellido,dni, edad, altura, peso);
                    Persona persona2 = new Persona("Martin", "Ruiz");
                    Persona persona3 = new Persona();

                    persona1.mostrarDatos();
                    persona2.mostrarDatos();
                    persona3.mostrarDatos();

                    break;
                case 2:
                    break;
            }
        }while (opcion != 2);
    }
}
