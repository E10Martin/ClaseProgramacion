import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosBaseArrayList {

    private static Scanner teclado = new Scanner(System.in);
    private static Random aleatorio = new Random();
    public static void main(String[] args) {
        //ejer1();
        ejer2();
    }

    public static void ejer1(){
            //1. Crea un ArrayList de String y realiza las siguientes acciones
            //- Guarda manualmente 10 palabras
            //- Imprime por pantalla todas las palabras del arraylist
        ArrayList<String> listaPalabras = new ArrayList<>(10);
        listaPalabras.add("Manzana");
        listaPalabras.add("Banana");
        listaPalabras.add("Cereza");
        listaPalabras.add("Durazno");
        listaPalabras.add("Uva");
        listaPalabras.add("Piña");
        listaPalabras.add("Fresa");
        listaPalabras.add("Mango");
        listaPalabras.add("Sandía");
        listaPalabras.add("Melón");

        for (String item:listaPalabras) {
            System.out.print(item+",\t");
        }

    }
    public static void ejer2(){
        ArrayList<Integer>listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = aleatorio.nextInt(101);
            listaNumeros.add(numeroAleatorio);
        }
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num :listaNumeros) {
            suma += num;
            if (num > max){
                max =num;
            }
            if (num<min){
                min =num;
            }

        }
        System.out.println("Números aleatorios generados: " + listaNumeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (double)suma/listaNumeros.size());
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }

}
