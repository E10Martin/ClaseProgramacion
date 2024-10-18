import java.util.Scanner;

public class EntradaWhile {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo2();

    }

    public static void ejemplo1() {
        //bucle hasta que el usuario de un 0 por consola
        int numero = -1;
        int i = 0;
        /*while (numero!=0){
            //pido numero
            i++;
            System.out.printf("Introduce un numero.");
           numero = teclado.nextInt();

        }
        System.out.println("Has introducido "+i);*/
        do {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            i++;

        } while (numero != 0);
        System.out.println("El numero de introducidos es: " + i);
    }

    public static void ejemplo2() {
      int opcion;
        do {
            System.out.println("Op1");
            System.out.println("Op2");
            System.out.println("Op3");
            System.out.println("Op4");
            System.out.println("Op5");
            System.out.println("Que quieres leer");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando opcion borrar.");
                    break;
                case 2:
                    System.out.println("Ejecutando op2");
                    break;
                case 3:
                    System.out.println("Ejecutando op3");
                    break;
                case 4:
                    System.out.println("Ejecutando op4");
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        } while (opcion != 5);

    }
}
