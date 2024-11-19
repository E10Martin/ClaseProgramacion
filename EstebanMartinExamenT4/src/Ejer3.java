import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
    static Scanner telcado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        int[] numeros = new int[20];

        int opcion;
        do {
            System.out.println("1.Registrar posiciones.");
            System.out.println("2. Obtener elementos de una posición pedirá por teclado una posición y\n" +
                    "mostrará el dato asociado a dicha posición.");
            System.out.println("3. Mostrar el array completo.");
            System.out.println("4. Mostrar el array ordenado.");
            System.out.println("5. Rotar array.");
            System.out.println("6. Salir");
            System.out.println("Introduce una opcion;");
            opcion = telcado.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print("Introduce los numeros;");
                        numeros[i] = telcado.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Introduce una posicion por teclado;");
                    int posicion = telcado.nextInt();
                    int numeroArray=0;
                    for (int i = 0; i < numeros.length; i++) {
                        numeroArray =numeros[posicion-1];
                    }
                    System.out.println(numeroArray);
                    break;
                case 3:
                    for (int item : numeros) {
                        System.out.print(item+"\t");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    // Ordenar y mostrar los elementos
                    for (int i = 0; i < numeros.length - 1; i++) {
                        for (int j = 0; j < numeros.length - i - 1; j++) {
                            if (numeros[j] > numeros[j + 1]) {
                                int temp = numeros[j];
                                numeros[j] = numeros[j + 1];
                                numeros[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Numeros ordenados:");
                    for (int item : numeros) {
                        System.out.print(item + " ");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo del programa.....");
                    break;

            }
        } while (opcion != 6);
    }
}
