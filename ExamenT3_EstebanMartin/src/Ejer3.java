import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
        static Scanner teclado = new Scanner(System.in);
        static Random aleatorio = new Random();
        public static void main(String[] args) {
            String clave = "1234";
            int intentos = 4;
            int dineroCaja = aleatorio.nextInt(10000)+1;

            for (int i = 0; i < intentos; i++) {
                //ingresar codigo
                System.out.println("Introduce el código de 4 dígitos: ");
                String codigoUsuario = teclado.next();
                // mirar código  correcto
                if (codigoUsuario.equals(clave)) {
                    System.out.println("Perfecto, la caja ha sido abierta");
                    //Me apetecia decir cunato dinero has ganado se abres la caja
                    System.out.println("Has ganado "+ dineroCaja +" €");
                    break;
                } else {
                    if (i < intentos - 1) {
                        System.out.println("Intento fallido, prueba de nuevo");
                    } else {
                        System.out.println("Lo siento, caja bloqueada");
                    }
                }
            }

        }
}
