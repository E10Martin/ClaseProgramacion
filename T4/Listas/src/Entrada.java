import java.util.ArrayList;
import java.util.Random;

public class Entrada {

    static Random aleatorio =  new Random();
    private static ArrayList<Integer> listaNumeros = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Utilizando litas");
        System.out.println("El tamaño inicial de la lista es: "+listaNumeros.size());
        añadirNumero(50);
        añadirNumero(20);
        añadirNumero((aleatorio.nextInt(21)));
        obtenerDatos();
    }

    public static void añadirNumero(int numero){
        listaNumeros.add(numero);
        System.out.println("Numero añadido corectamente");
        System.out.println("Lista actualizada con un size de "+listaNumeros.size());
    }

    public static void obtenerDatos(){
        //System.out.println("El ultimo elemento de la array es "+listaNumeros.get(listaNumeros.size()-1));
        System.out.println("Todos los elementos de la array; ");
        for (int item :listaNumeros) {
            System.out.println(item+"\t");
        }
    }
}
