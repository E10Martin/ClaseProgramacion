import java.util.Random;
import java.util.Scanner;

public class Ejer2 {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        System.out.println("De cuanto quieres la array; ");
        int longitudArray = teclado.nextInt();
        int[] numeros = new int[longitudArray];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(21);
        }
        for (int item : numeros) {
            System.out.print(item+"\t");
        }

        //System.out.println("** mostrar extremos"); Mostrará el elemento más grande
        //y el elemento más pequeño
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        for (int item : numeros) {
            if (item > numeroMayor) {
                numeroMayor = item;
            }
            if (item < numeroMenor) {
                numeroMenor = item;
            }
        }

        System.out.printf("\nEl %d es el mayor y el %d es el numero menor.", numeroMayor, numeroMenor);

        int contadorPares = 0, contadorImpares =0;
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]%2==0) {
                contadorPares +=1;
            }else {
                contadorImpares +=1;
            }
        }
        System.out.printf("\nHay %d pares y %d impares.", contadorPares, contadorImpares);

        System.out.println("\nIntroduce un numero haber si coincide; ");
        int coincidencia = teclado.nextInt();
        int contadorIguales = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == coincidencia) {
                contadorIguales += 1;
            }
        }
        System.out.printf("Se repite %d veces. ", contadorIguales);
    }
}
