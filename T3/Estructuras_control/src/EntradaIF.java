import java.util.Scanner;

public class EntradaIF {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String p1 = "Hola que tal";
        String p2 = "Hola que tal";
        //son iguales
        boolean iguales = p1.equals(p2);
        boolean igualesCAP = p1.equalsIgnoreCase(p2);
        //pasar mayusculas o minusculas
        p1 = p2.toUpperCase();
        //contiene
        boolean contiene = p1.contains("que");
        //cuantas letras hay
        p1.length();    
        //sacar una letra de una palabra
        p1.charAt(0);

    }
}
