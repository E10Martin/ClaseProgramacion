import java.util.Scanner;

public class EjercicioTres {
    //En una clase llamada Ejercicio3, calcula la cantidad que debe pagar un cliente en la
    //compra de un coche a plazos en un periodo determinado, siendo el interés mensual

    //progresivo del 3.5 %. Lo primero que debes pedir por consola es el precio del coche
    //y en cuantos plazos se va a pagar. Una vez introducido esto aparecerá el siguiente
    //texto (para un valor de 30.000 y en un plazo de 6, siendo estos datos un ejemplo):
    //“Vas a pagar el coche de 30000€ en 6 meses, con un total de 5000€ cada plazo (sin
    //tener en cuenta los intereses)”
    static Scanner teclado = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("Precio coche: ");
        int precioCoche = teclado.nextInt();
        System.out.println("Plazos de pago: ");
        int plazos = teclado.nextInt();
        int total = precioCoche/plazos;
        System.out.printf("Vas a pagar el coche de %d€ en %d meses, con un total de %d€ cada plazo (sin tener en cuenta los intereses)", precioCoche, plazos, total);


    }
}
