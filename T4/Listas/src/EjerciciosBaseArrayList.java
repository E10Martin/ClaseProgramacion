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
        for  (int i = 0; i < 10; i++) {
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
    public static void ejer4(){
        //Crea un programa que cree un ArrayList de palabras, introduce en él 10 palabras cualquiera.
        // Muestra el número de letras de todas las palabras, la palabra con más letras y la palabra con menos letra

        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("fdrgg");
        listaPalabras.add("grgeg");
        listaPalabras.add("rgerggwerg");
        listaPalabras.add("rgegrgegrre");
        listaPalabras.add("rgegrg");
        listaPalabras.add("gegrg");
        listaPalabras.add("gre");
        listaPalabras.add("er");
        listaPalabras.add("err");
        listaPalabras.add("h");

        int numeroLetras =0;
        String palabraMayor = listaPalabras.get(0);
        String palabraMenor = listaPalabras.get(0);
        for (String item:listaPalabras) {
            numeroLetras +=item.length();
            if (palabraMayor.length()<item.length()){
                palabraMayor = item;
            }
            if (palabraMenor.length()>item.length()){
                palabraMenor = item;
            }
        }
    }

}
