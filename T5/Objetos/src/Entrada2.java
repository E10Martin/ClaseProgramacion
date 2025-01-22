
import java.util.Scanner;

public class Entrada2 {

    static Scanner scanner = new Scanner(System.in);
    static Carrera2 carrera = new Carrera2();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("1. Introduce los participantes");
            System.out.println("2. Mostrar participantes");
            System.out.println("3. Introduce los participantes");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el numero de los participantes");
                    int nParticipantes = scanner.nextInt();
                    for (int i = 0; i < nParticipantes ; i++) {

                        System.out.println("Introduce marca:");
                        String marca = scanner.next();
                        System.out.println("Introduce modelo:");
                        String modelo = scanner.next();
                        System.out.println("Introduce matricula:");
                        String matricula = scanner.next();
                        System.out.println("Introduce cv:");
                        int cv = scanner.nextInt();
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion !=4);

    }
}
