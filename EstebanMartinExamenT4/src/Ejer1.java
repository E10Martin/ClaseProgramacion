
import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
    //1. Crear una aplicación que sea capaz de rellenar un array de 15 elementos sin que se
//repita ninguno de ellos. Para ello, los números que se meterán son aleatorios entre 0 y
//16. Una vez hecho esto:
//- Muestra los elementos del array sin ordenar.
//- Muestra los elementos del array ordenados.
//- Muestra solo los elementos que están en posiciones pares
//- Muestra solo los elementos que son pares
    static Random aleatorio = new Random();

    public static void main(String[] args) {


        int[] array = new int[15];
        int numerosIguales = 0;
        System.out.println("NUmeros originales: ");
        while (numerosIguales < 15) {
            int numero = aleatorio.nextInt(17);
            boolean repetido = false;

            for (int i = 0; i < numerosIguales; i++) {
                if (array[i] == numero) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                array[numerosIguales++] = numero;
            }
        }

        for (int item : array) {
            System.out.print(item+"\t");
        }
        System.out.println("");

        System.out.println("Numeros en posiciones pares:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Elementos que son pares:");
        for (int numero : array) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Numeros ordenados:");
        for (int item : array) {
            System.out.print(item + " ");
        }

    }
}
