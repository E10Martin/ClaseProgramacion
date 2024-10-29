import java.util.Scanner;

public class Ejer3 {
        static Scanner teclado = new Scanner(System.in);
        public static void main(String[] args) {
            String clave = "1234";
            int intentos = 4;

            for (int i = 0; i < intentos; i++) {
                //ingresar codigo
                System.out.print("Introduce el código de 4 dígitos: ");
                String codigoUsuario = teclado.next();
                // mirar código  correcto
                if (codigoUsuario.equals(clave)) {
                    System.out.println("Perfecto, la caja ha sido abierta");
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
