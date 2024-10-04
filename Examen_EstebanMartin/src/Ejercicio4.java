import java.util.Scanner;

public class Ejercicio4 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellido: ");
        String apellido = teclado.next();
        System.out.println("Sueldo que esperas recibir: ");
        float sueldo = teclado.nextFloat();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        System.out.println("Cumpleaños: ");
        int cumpleanos = teclado.nextInt();
        System.out.println("Carnet:(SI-->1)(NO-->2)");
        int carnet = teclado.nextInt();

        boolean apto1 = ((edad<50) && (sueldo<40000) && (carnet==1)) || ((edad>45) && (sueldo<20000) && (cumpleanos%2==0));
        System.out.printf("Con los datos introducido cuyo nombre es %s %s tiene como resolucion:%b", nombre, apellido, apto1);






    }
}
