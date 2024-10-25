import java.util.Scanner;

public class ExamenSimulacro {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejer1();
        ejer2();

    }

    public static void ejer1() {
        int numeros;
        int intentosUsuario = 0;
        int suma = 0;
        do {
            int media;
            int opciones;
            System.out.println("Introduce un numero.");
            numeros = teclado.nextInt();
            numeros++;
            intentosUsuario++;
            suma += numeros;

            if (numeros <= 0) {

                do {
                    System.out.println("1-Suma de los números pares introducidos.");
                    System.out.println("2-Media de los números pares introducidos con dos decimales.");
                    System.out.println("3-Media de los números impares introducidos con dos decimales.");
                    System.out.println("4-Cuántos números hemos introducido.");
                    System.out.println("5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares\n" +
                            "y cuantos impares.");
                    System.out.println("6.-Salir.");
                    opciones = teclado.nextInt();
                    if (opciones > 6) {
                        System.out.println("Del 1 al 6");
                    }
                    switch (opciones) {
                        case 1:
                            System.out.println("La suma de los numero es: " + suma);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                    }

                } while (opciones != 6);
            }

        } while (numeros >= 0);
    }

    public static void ejer2() {

        int numAprobados = 0, numSuspensos = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce tu nota:");
            int nota = teclado.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota >= 5) {
                    numAprobados++;
                } else {
                    numSuspensos++;
                }
            }else {
                System.out.println("Nota invalida");
            }

        }
        System.out.println("El numero de aprobados es;" + numAprobados);
        System.out.println("El numero de suspensos es: "+ numSuspensos );

    }
}
