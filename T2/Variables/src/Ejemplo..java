import java.util.Scanner;

public class Ejemplo {
     static Scanner teclado = new Scanner(System.in);
    public static void main (String[] args){
    // valoresmax();
        String nombre;
        System.out.println("Introduce el nombre: ");
        nombre = teclado.next();
        Integer edad;
        System.out.println("Introduce la edad: ");
        edad = teclado.nextInt();
        Float altura;
        System.out.println("Introduce tu altura");
        altura = teclado.nextFloat();
        //Boolean trabajas;
        //System.out.println("¿Trabajas?");
        //trabajas = teclado.nextBoolean();
        System.out.printf("Tu nombre es %s tu edad %d y mides %.2f ", nombre, edad, altura);

    }
    /* static void valoresmax(){
        System.out.printf("Hola me llamo %s y me gustaria sacar %d pero saco %.2f ", "Esteban", 10, 6.56);
    } */

}
