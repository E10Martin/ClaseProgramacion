import java.util.Scanner;

public class Ejercicio3 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //a
        System.out.println("Que tipo de cafe quieres (espresso, latte,capuchino); ");
        String cafe = teclado.next();
        //b
        System.out.println("Cantidad de azucar;");
        int azucar = teclado.nextInt();
        //c
        System.out.println("Tamaño (pequeño, mediano, grande);");
        String tamaño = teclado.next();
        //d
        System.out.printf("Preparando un %s de tamaño %s con %d cucharaditas de azuar.", cafe, tamaño, azucar);

    }
}
