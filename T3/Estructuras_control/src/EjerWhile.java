import java.util.Random;
import java.util.Scanner;

public class EjerWhile {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio =  new Random();

    public static void main(String[] args) {
        //ejer5();
        //ejer7();
    }
    public static void ejer5(){
        String repetir;
        do {
            int nAleatorio = aleatorio.nextInt(20) + 1;
            System.out.println(nAleatorio);
            int numeroUsuario = 0;
            int intentosUsuario = 0;
            int numIntentos = 6;
            do {
                System.out.println("Por favor introduce un numero");
                numeroUsuario = teclado.nextInt();
                intentosUsuario++;
                numIntentos--;
                if (numeroUsuario == nAleatorio) {
                    System.out.println("Has acertado");
                } else {
                    System.out.println("Has fallado");
                    intentosUsuario++;

                }
            } while (nAleatorio != numeroUsuario && numIntentos > 0);
            System.out.println("Quieres volver a jugar(S/N)");
            repetir = teclado.next();
        } while (repetir.equalsIgnoreCase("s"));
        System.out.println("Se acabo");

    }
    public static void ejer7(){
        int numero;
        do{
            System.out.println("Opcion 1:");
            System.out.println("Opcion 2:");
            System.out.println("Opcion 3:");
            System.out.println("Opcion 4:");
            System.out.println("Salir(5):");
            numero = teclado.nextInt();
            if (numero >=6){
                System.out.println("Opcion no contemplada");
            }
            switch (numero){
                case 1:
                    System.out.println("Ejecutando opcion 1");
                    break;
                case 2:
                    System.out.println("Ejecutando opcion 2");
                    break;
                case 3:
                    System.out.println("Ejecutando opcion 3");
                    break;
                case 4:
                    System.out.println("Ejecutando opcion 4");
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
            }
        } while(numero != 5 );
    }
    
}
