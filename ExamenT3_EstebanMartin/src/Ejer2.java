import java.util.Random;
import java.util.Scanner;

public class Ejer2 {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int numeroUsuario = teclado.nextInt();
        int acumuladorNUmeros = 0;
        int numeroAleatorio = 0;
        int sumaTotal = 0;


        for (int i = 0; i < 10; i++) {
            numeroAleatorio = aleatorio.nextInt(100) + 1;
            System.out.println(numeroAleatorio);
            acumuladorNUmeros++;
            sumaTotal += numeroAleatorio;

        }
        System.out.println("Numero medio generado; " + (float) (sumaTotal / acumuladorNUmeros));
        System.out.println("La suma de todos los numeros; " + sumaTotal);

        boolean iguales = false;
        if (numeroAleatorio == numeroUsuario) {
            iguales = true;
        }
        System.out.println("Maximo: ");
        if (iguales) {
            System.out.println("El número " + numeroUsuario + " está entre los números.");
        } else {
            System.out.println("El número " + numeroUsuario + " no está entre los números.");
        }

    }
}


