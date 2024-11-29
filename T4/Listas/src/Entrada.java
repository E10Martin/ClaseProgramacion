import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Entrada {

    static Random aleatorio =  new Random();
    private static ArrayList<Integer> listaNumeros = new ArrayList<>();

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Utilizando litas");
        System.out.println("El tamaño inicial de la lista es: "+listaNumeros.size());
        añadirNumero(50);
        añadirNumero(20);
        añadirNumero((aleatorio.nextInt(21)));
        obtenerDatos();
    }

    public static void añadirNumero(int numero){
        if (listaNumeros.contains(numero)){
            // estas seguro
            System.out.println("El numero esta dentro de la lista, ¿seguro que quieres meterlo?");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("y")){
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
    public static int encontrarNumero(int numero){
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i)== numero){
                return i;
            }
        }
        return -1;
    }
    public static void obtenerDatos(){
        //System.out.println("El ultimo elemento de la array es "+listaNumeros.get(listaNumeros.size()-1));
        System.out.println("Todos los elementos de la array; ");
        for (int item :listaNumeros) {
            System.out.println(item+"\t");
        }
    }
}
