import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = (int)(Math.random()*9000)+1000;
        System.out.println("Introduce un numero enre 1000 y 9999; ");
        int n2 = teclado.nextInt();
        //boolean total = n2.compareTo(n1);
System.out.println("El numero tuyo es" + n2);
System.out.println("El numero aleatorio es:" + n1);
boolean i = n1 == n2;
System.out.println("Son iguales:" + i);


    }
}
