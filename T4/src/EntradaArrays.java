import java.util.Random;
import java.util.Scanner;

public class EntradaArrays {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        //array --> conjunto finito de datos, no dinamicos
        int[] numeros = new int[5];
        // 0 0 0 0 0
        // cuantas posiciones tienes
        System.out.println("La longitud " + numeros.length);
        // 0 0 0 0 7
        numeros[4] = 7;
        System.out.println("El numero en la ultima posicion es " + numeros[numeros.length - 1]);


        String[] palabras = {"Hola", "Que", "tal", "Estas"};
        System.out.println("La palabras es " + palabras[palabras.length - 1]);

        //sacar todas las palabras que estan en el array,
        // imaginar que tengo 4000000
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        // rellenar el array de numeros con aleatorios d entre 0 y 100
        /*for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (aleatorio.nextInt(100) + 1);
            System.out.println("Numero: "+numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            // los numeros en posicoin par
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
            if (numeros[i]%2 == 0){
                System.out.println(numeros[i]);
            }

        }*/
        numeros[2]=6;
        numeros[4]= 50;
        for (int item : numeros) {
            if (item % 2 == 0){
                System.out.println(item);
            }
            if (item == 50){
                System.out.println(item);
            }

        }

    }

}
