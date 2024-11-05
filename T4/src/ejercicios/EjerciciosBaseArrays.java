package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosBaseArrays {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        ejer2();
    }
    static void ejer2(){
        //Realiza un programa que pida 10 números por teclado y que los almacene en un array.
        // A continuación se mostrará el contenido de ese array junto al índice (0 – 9)

        int numero[]= new int [10];
        for (int i = 0; i < numero.length ; i++) {
            System.out.println("Introduce un numero: ");
            numero[i] = teclado.nextInt();
            System.out.println("El numero es; "+ numero[i]);
        }
    }
}
