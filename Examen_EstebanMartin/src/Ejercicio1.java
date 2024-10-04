import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //a
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellido: ");
        String apellido = teclado.next();
        //b
        System.out.println("Dinero disponible: ");
        float dinero = teclado.nextFloat();
        //c
        System.out.println("Cuanto cuesta la play 5: ");
        float playCinco = teclado.nextFloat();
        //d
        System.out.println("Cuanto cuesta el iPhone 5: ");
        float iphone = teclado.nextFloat();
        //e
        System.out.println("Iva actual: ");
        float iva = teclado.nextFloat();
        //f
        float iva1= iva/100;
        float ivaPlay= iva1*playCinco;
        boolean comprarPlay = (ivaPlay+playCinco)<=dinero;
        System.out.println("Te puedes comprar la play 5: "+comprarPlay);
        float ivaIphone= iva1*iphone;
        boolean comprarIphone = (ivaIphone+iphone)<=dinero;
        System.out.println("Te puedes comprar Iphone 5: "+comprarIphone);
        boolean total1 = (ivaPlay+playCinco+ivaIphone+iphone) <= dinero;
        System.out.println("Te puedes comprar las dos cosas: "+total1);




    }
}
