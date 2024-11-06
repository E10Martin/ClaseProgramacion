package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosBaseArrays {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        //ejer1();
        ejer2();
    }
     public static void ejer1(){
        //Realiza un programa que pida 10 números por teclado y que los almacene en un array.
        // A continuación se mostrará el contenido de ese array junto al índice (0 – 9)

        int numero[]= new int [10];
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Introduce un numero: ");
            numero[i] = teclado.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("El numero en la posicion %d es %d\n ", i+1,numero[i]);
        }
    }

    public static void ejer2(){
        //2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array. Una vez metidos, se deberá mostrar:
        //    - Numero de puntos obtenidos
        //    - Media de puntos obtenidos
        int numeros[] = new int [30];
        int sumaTotal = 0;
        for (int i = 0; i < 30; i++) {
            int numerosAleatorios = aleatorio.nextInt(10)+1;
            numeros[i] = numerosAleatorios;
            sumaTotal += numeros[i];
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d\n", numeros[i]);

        }
        System.out.println("Numero de puntos obtenidos; "+ sumaTotal);
        System.out.printf("Media de puntos obtenidos; "+(double) sumaTotal/30);

    }

}
