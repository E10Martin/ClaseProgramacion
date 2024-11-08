package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosBaseArraysMultiUni {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        //ejer1();
        ejer2();
    }

    public static void ejer1() {
        //1. (MultiplicarArray) Crear un array de 5 posiciones:
        //    - se le pedirá al usuario que introduzca cada unos de los elementos del array
        //    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
        //    - Saca por consola la suma de todos los números
        //    - Saca la media de todos los elementos

        int[] numeros = new int[5];
        int sumaTotal = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = teclado.nextInt();
        }
        for (int salida : numeros) {
            System.out.print(salida * 2 + " ");
            sumaTotal += salida * 2;
        }
        System.out.printf("la suma total es: " + sumaTotal);
        System.out.printf("\nLa suma total es: " + (double) sumaTotal / numeros.length);


    }
    public static void ejer2() {
        //2.  Crea una aplicación que realice lo siguiente:
        //    - pida por pantalla la longitud del array de enteros
        //    - crea el array de enteros con la longitud introducida
        //    - pida al usuario que introduzca todos los datos del array
        //saque por pantalla el elemento mayor y el elemento menor

        System.out.println("Que longitud de enteros quieres; ");
        int numeroArray = teclado.nextInt();
        int[] array = new int[numeroArray];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero; ");
            array[i] = teclado.nextInt();
        }
        int menor = array[0], mayor = array[0];
        for (int item : array) {
            if (item<menor){
                menor = item;
            }
            if (item>mayor){
                mayor = item;
            }
        }
        System.out.println("El numero menor es "+menor+" y el numero mayor es "+mayor);
    }
    public static void ejer3(){
        //3.  Crear una aplicación que:
        //    - pida la longitud de dos arrays de enteros
        //    - crea los array de enteros con las longitudes introducidas
        //    - crea un tercer array de la misma longitud que los dos anteriores
        //    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)

    }

}

