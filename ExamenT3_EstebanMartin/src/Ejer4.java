import java.util.Scanner;

public class Ejer4 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Crea una aplicación que permita al usuario introducir un numero en base
        //decimal. Una bez introducido, en el caso de que sea negativo, saltará un
        //aviso de que nose puede hacer la operación. En el caso de que el numero
        //sea positivo, saltará un menú para poder elegir el tipo de cambio de base
        //a. Base 2
        //b. Base 8
        //c. Base 16.
        //Cuando el usuario selecciona la base, se mostrará el resultado y volverá a
        //salir el menu

        System.out.println("Introduce un número decimal: ");
         int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println(" Número negativo(no vale)");
        } else {
            int opcion;

            do {
                System.out.println("Selecciona el tipo de cambio:");
                System.out.println("1. Base 2 ");
                System.out.println("2. Base 8 ");
                System.out.println("3. Base 16 ");
                System.out.println("4. Salir");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Numero en base 2: " + Integer.toBinaryString(numero));
                        break;
                    case 2:
                        System.out.println("Numero en base 8: " + Integer.toOctalString(numero));
                        break;
                    case 3:
                        System.out.println("Numero en base 16: " + Integer.toHexString(numero));
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } while (opcion != 4);
        }


    }
}

