import java.util.Scanner;

public class ExamenSimulacro {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejer1();
        //ejer2();
        //ejer3();
        ejer4();

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
            } else {
                System.out.println("Nota invalida");
            }

        }
        System.out.println("El numero de aprobados es;" + numAprobados);
        System.out.println("El numero de suspensos es: " + numSuspensos);

    }

    public static void ejer3() {
        final int PIN = 1111;
        double saldo = 0;
        int opcion = 0;
        do {
            System.out.println("1.Ingresar ");
            System.out.println("2.Sacar");
            System.out.println("3.Consultar");
            System.out.println("4.Salir");
            System.out.println("Que quieres hacer");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime el pin de la cuenta");
                     int pinUsuario = teclado.nextInt();
                     if (pinUsuario ==PIN){
                         System.out.println("Que cantidad quieres ingresar");
                         int cantidad = teclado.nextInt();
                         if (cantidad>0){
                             saldo+= cantidad;
                             System.out.println("Saldo actualizado");
                         } else {
                             System.out.println("Cantidad invalida");
                         }
                     } else {
                         System.out.println("este no es PIN");
                     }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("El saldo de a cuenta es: "+ saldo);
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4)
    }

    public static void ejer4() {
        System.out.println("Introduce euna frase.");
        String frase = teclado.nextLine();

        frase = frase.replaceAll("á", "a")
                .replaceAll("é", "e")
                .replaceAll("í", "i")
                .replaceAll("ó", "o")
                .replaceAll("ú", "u");
        if (frase.length() < 4) {
            frase = frase.toUpperCase();
            System.out.println("Palabra en mayusculas: " + frase);
        } else if (frase.length() < 8) {
            frase = frase.toLowerCase();
            System.out.println("Palbra en minusculas: " + frase);
        }else if ( frase.length() < 11) {
            frase = frase.replaceAll("a", "á")
                    .replaceAll("e", "é")
                    .replaceAll("i", "í")
                    .replaceAll("o", "ó")
                    .replaceAll("u", "ú");
            System.out.println("Palabra acentuada: " + frase);
        } else {
            String palabraIinversa = "";
            for (int i = frase.length() -1; i <=0; i--) {
                palabraIinversa += frase.charAt(i);

            }
        }

    }

    public static void ejer5() {
        int numero = 0;
        int acumuladorPares = 0, acumuladorImpares = 0;
        int incrementadorPares = 0, incrementadorImpares = 0, incrementadorCeros = 0;
        while (numero) {
            System.out.println("Introduce un numero:");
            numero = teclado.nextInt();
            if (numero > -1) {
                if (numero % 2 == 0) {
                    acumuladorPares += numero;
                    acumuladorPares++;
                }
                if (numero % 2 != 0) {
                    acumuladorImpares += numero;
                    acumuladorImpares++;
                }
                if (numero == 0) {
                    incrementadorCeros++;
                }
            }

        }
        int opcion;
        do {
            System.out.println("Suma par");
            System.out.println("Media par");
            System.out.println("Media impares");
            System.out.println("Numeros introducidos");
            System.out.println("NUmero pares imapres y ceros");
            System.out.println("Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los pares es: " + acumuladorPares);
                    break;
                case 2:
                    System.out.println("La media de los pares es: " + (double) acumuladorPares / incrementadorPares);
                    break;
                case 3:
                    System.out.println("La media de los impares introducidos es: " + (double) acumuladorImpares / incrementadorImpares);
                    break;
                case 4:
                    System.out.println("el numero introducidos es de: " + acumuladorPares + acumuladorImpares);
                    break;
                case 5:
                    System.out.println("numero pares: " + acumuladorPares);
                    System.out.println("numero impares: " + acumuladorImpares);
                    System.out.println("numerode ceros: " + incrementadorCeros);
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion != 6);
    }

}
