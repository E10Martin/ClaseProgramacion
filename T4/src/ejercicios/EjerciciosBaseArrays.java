package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosBaseArrays {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        //ejer1();
        //ejer2();
        ejer7();
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

    public static void ejer3(){
        //3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
        //    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
        //    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido
        int []numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero; ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Numeros al reves;");

        for (int i = 9; i >= 0 ; i--) {
            System.out.print(","+ numeros[i]);
        }
        System.out.println("");
        System.out.println("Numeros normal;");
        for (int i = 0; i <10 ; i++) {
            System.out.print(","+numeros[i]);
        }
    }
    public static void ejer4(){
        //4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
        //    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
        //    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.
        int []numero= new int[20];
        int cuadrado[]= new int[20];
        int cubo[]= new int[20];
        for (int i = 0; i < 20; i++) {
            numero[i] = aleatorio.nextInt(101);
            cuadrado[i]= numero[i]*numero[i];
            cubo[i]= numero[i]*numero[i]*numero[i];
        }
        System.out.printf("%-10s %-10s %-11s\n","Numero","Cuadrado","Cubo");
        System.out.println("----------------------------");

        for (int i = 0; i < 20; i++) {
            System.out.printf("%-10d %-10d %-10d\n ",numero[i],cuadrado[i],cubo[i]);
        }
    }
    public static void ejer5(){
        //Realiza un programa que pida 8 números enteros, los guarde en un array y
        // que luego muestre esos números junto con la palabra “par” o “impar” según proceda.

        int []numeros = new int [8];
        for (int i = 0; i < 8; i++) {
            System.out.println("INtroduce un numero; ");
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            if (numeros[i]%2 == 0 ){
                System.out.printf("El numero %d es %s\n", numeros[i],"par");
            }
            if (numeros[i] % 2 != 0) {
                System.out.printf("El numero %d es %s\n", numeros[i], "impar");
            }

        }
    }
    public static void ejer6(){
        //2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
        //    - modificar todos los 6 por 8
        //    - modificar todos los 7 por 15
        //    - modificar todos los 20 por 10

        int [] numeros = new int [20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(31);
        }

        System.out.println("Numeros dados:");
        for (int numSalida : numeros){
            System.out.print(numSalida+" ");
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==6) {
                numeros[i]= 8;
            }else if (numeros[i]==7) {
                numeros[i]= 15;
            } else if (numeros[i]==20) {
                numeros[i]= 10;
            }
        }
        System.out.println("\nNumeros actualizados:");
        for(int numSalida : numeros){
            System.out.print(numSalida+" ");
        }

    }

    public static void ejer7() {
        String[] palabras = new String[10];

        // Pedir 10 palabras al usuario
        System.out.println("Introduce 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = teclado.nextLine();
        }

        while (true) {
            // Menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Ver todas las palabras");
            System.out.println("2. Obtener una palabra al azar");
            System.out.println("3. Ver número de letras");
            System.out.println("4. Ver media de letras");
            System.out.println("5. Ver palabra con más letras");
            System.out.println("6. Ver palabra con menos letras");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");
            int opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Ver todas las palabras
                    System.out.println("\nTodas las palabras:");
                    for (String palabra : palabras) {
                        System.out.println(palabra);
                    }
                    break;
                case 2:
                    // Obtener una palabra al azar
                    int indiceAleatorio = aleatorio.nextInt(palabras.length);
                    System.out.println("\nPalabra al azar: " + palabras[indiceAleatorio]);
                    break;
                case 3:
                    // Ver número total de letras
                    int totalLetras = 0;
                    for (String palabra : palabras) {
                        totalLetras += palabra.length();
                    }
                    System.out.println("\nNúmero total de letras: " + totalLetras);
                    break;
                case 4:
                    // Ver media de letras
                    int totalLetrasMedia = 0;
                    for (String palabra : palabras) {
                        totalLetrasMedia += palabra.length();
                    }
                    double media = (double) totalLetrasMedia / palabras.length;
                    System.out.println("\nMedia de letras: " + media);
                    break;
                case 5:
                    // Ver palabra con más letras
                    String palabraMax = palabras[0];
                    for (String palabra : palabras) {
                        if (palabra.length() > palabraMax.length()) {
                            palabraMax = palabra;
                        }
                    }
                    System.out.println("\nPalabra con más letras: " + palabraMax);
                    break;
                case 6:
                    // Ver palabra con menos letras
                    String palabraMin = palabras[0];
                    for (String palabra : palabras) {
                        if (palabra.length() < palabraMin.length()) {
                            palabraMin = palabra;
                        }
                    }
                    System.out.println("\nPalabra con menos letras: " + palabraMin);
                    break;
                case 7:
                    // Salir
                    System.out.println("\nSaliendo del programa...");
                    return;
                default:
                    System.out.println("\nOpción no válida. Por favor, elige una opción entre 1 y 7.");
                    break;
            }
        }

    }


}
