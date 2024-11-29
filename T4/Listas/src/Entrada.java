import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class Entrada {

    static Random aleatorio = new Random();
    private static ArrayList<Integer> listaNumeros = new ArrayList<>();
    private static ArrayList<String> listaPalabras = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        /*System.out.println("Utilizando litas");
        System.out.println("El tamaño inicial de la lista es: "+listaNumeros.size());
        añadirNumero(50);
        añadirNumero(20);
        añadirNumero((aleatorio.nextInt(21)));
        obtenerDatos();*/
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Palabra 2");
        listaPalabras.add("Palabra 3");
        listaPalabras.add("Palabra 4");
        listaPalabras.add("Palabra 5");
        listaPalabras.add("Palabra 51");
        listaPalabras.add("Palabra 52");
        listaPalabras.add("Palabra 53");
        listaPalabras.add("Palabra 54");

        listaPalabras.remove("Palabra 1");
        /*listaPalabras.removeIf(new Predicate<String>()) {
            @Override
            public boolean test(String s) {
                return s.contains("5");
                /*if (s.contains("5")){
                    return true;
                } else {
                    return true;
                }*/
            //}
        //}

                listaPalabras.set(4, "Palabra 41");

        for (String item : listaPalabras) {
            System.out.println(item);
        }
    }

    public static void añadirNumero(int numero) {
        if (listaNumeros.contains(numero)) {
            // estas seguro
            System.out.println("El numero esta dentro de la lista, ¿seguro que quieres meterlo?");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("y")) {
                listaNumeros.add(numero);
                System.out.println("Numero añadido correctamente");
                System.out.println("Lista actualizada con un size de " + listaNumeros.size());
            } else {
                System.out.println("Saliendo de añadir");
            }
        } else {
            listaNumeros.add(numero);
            System.out.println("Numero añadido correctamente");
            System.out.println("Lista actualizada con un size de " + listaNumeros.size());
        }
    }

    //TODO cambiar el entorno al indice donde esta el repetido
    public static int encontrarNumero(int numero) {
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) == numero) {
                return i;
            }
        }
        return -1;
    }

    public static void obtenerDatos() {
        //System.out.println("El ultimo elemento de la array es "+listaNumeros.get(listaNumeros.size()-1));
        System.out.println("Todos los elementos de la array; ");
        for (int item : listaNumeros) {
            System.out.println(item + "\t");
        }
    }
}
