import java.util.Random;
import java.util.Scanner;

public class EjerFor {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        //ejer1();
        //ejer3();
        //ejer4();
        //ejer5();
        //ejer6();
        //ejer7();
        //ejer11();
        //ejer13();
        //ejer14();
        //ejer15();
        //ejer16();
        ejer17();
    }

    public static void ejer1() {
        //Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
        // Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)
        System.out.println("Cuantas temperaturas quires introducir;");
        int nTemperatura = teclado.nextInt();
        int temperatura = 0;
        int sumatorio = 0;
        if (nTemperatura <= 0) {
            nTemperatura = 10;
        }
        for (int i = 0; i < nTemperatura; i++) {
            System.out.println("Introduce temperatura");
            temperatura = teclado.nextInt();
            sumatorio = sumatorio + temperatura;
        }
        System.out.println("La suma de todas las temperaturas " + sumatorio);
        System.out.println("La media de todas las temperaturas " + (float) sumatorio / nTemperatura);


    }

    public static void ejer3() {

        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 0; j < 11; j++) {
                //tabla de multiplicar de i
                System.out.printf("%d * %d = % d\n", i, j, i * j);
            }
        }
    }

    public static void ejer4() {
        System.out.println("");
        int n1 = teclado.nextInt();
        System.out.println("");
        int n2 = teclado.nextInt();

        for (int i = n1; i <= n2; i++) {
            System.out.printf("El numero %d tabla de mulriplicar:\n", i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

    }

    public static void ejer5() {
        //Dado dos enteros entre 0 y 5 (la base y el exponente),
        // obtener la potencia del primero elevado al segundo sin utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243.
        // Casos particulares: 00 = Error y n0 = 1.(BaseExponente)
        System.out.println("Numero:");
        int base = teclado.nextInt();
        System.out.println("Numero:");
        int exponente = teclado.nextInt();
        int total = 1;

        if (base == 0 && exponente == 0) {
            System.out.println("Error ttune.");
        } else {
            for (int i = 0; i <= exponente; i++) {
                total *= base;
            }
        }
        System.out.printf("Base; %d     Exponente; %d     Resultado; %d", base, exponente, total);

    }

    //Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)
    public static void ejer6() {
        System.out.println("Un numero: ");
        int n1 = teclado.nextInt();
        System.out.println("Otro numero: ");
        int n2 = teclado.nextInt();

        //Identificar el numero menor de los dos;
        int inicio = Math.min(n1, n2);
        int fin = Math.max(n1, n2);

        for (int i = inicio; i < fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "\n");
            }
        }

    }

    public static void ejer7() {
        System.out.println("Introduce el numero de veces que quieres lanzar el dado;");
        int lanzarDado = teclado.nextInt();

        if (lanzarDado <= 0) {
            lanzarDado = 100;
            System.out.println("Es negativo o 0 entoces se lanzara 100 veces; ");
        }
        Random aleatorio = new Random();

        for (int i = 1; i <= lanzarDado; i++) {
            int numeroAleatorio = aleatorio.nextInt(6) + 1;
            System.out.printf("%d --> %d\n", i, numeroAleatorio);
        }
    }

    public static void ejer8() {
        int acumuladorPositivos = 0, acumuladorNegativos = 0, numeroCeros = 0;
        int numeroPositivos = 0, numeroNegativos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el numero que quieres;");
            int numero = teclado.nextInt();

            if (numero > 0) {
                acumuladorPositivos += numero;
                numeroPositivos++;
            } else if (numero < 0) {
                acumuladorNegativos += numero;
                numeroNegativos++;
            } else {
                numeroCeros++;
            }
        }
        System.out.println("La media de los positivos es " + (float) acumuladorPositivos / numeroPositivos);
        System.out.println("La media de los negativos es " + (float) acumuladorNegativos / numeroNegativos);
        System.out.println("El numero de ceros es; " + numeroCeros);
    }

    public static void ejer10() {
        int numSS = 0, numAP = 0, numCD = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce la nota;");
            int nota = teclado.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota > 4) {
                    numAP++;
                } else if (nota > 4) {
                    numSS++;
                } else {
                    numCD++;
                }
            } else {
                System.out.println("Nota invalida");
            }
        }
        System.out.println("El numero de AP es; " + numAP);
        System.out.println("El numero de SS es; " + numSS);
        System.out.println("El numero de CD es; " + numCD);
    }

    public static void ejer11() {
        System.out.println("De que cuadrado lo quieres; ");
        int lado = teclado.nextInt();
        for (int i = 0; i < lado; i++) {
            //System.out.println("\t+\t");
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1) {
                    System.out.print("\t+\t");
                } else if (j == 0 || j == lado - 1) {
                    System.out.print("\t+\t");
                }
                System.out.print("\t\t");
            }
            System.out.println();
        }
    }

    public static void ejer13() {
        System.out.println("Introduce un palabra:");
        String p1 = teclado.next();
        for (int i = p1.length() - 1; i >= 0; i--) {
            System.out.print(p1.charAt(i));
        }


    }

    public static void ejer14() {
        System.out.println("Introduce un palabra:");
        String p1 = teclado.next();
        //no se tienen en cuenta las mayusculas
        p1.toLowerCase().replaceAll("á", "a")
                        .replaceAll("é", "e")
                        .replaceAll("í", "i")
                        .replaceAll("ó", "o")
                        .replaceAll("ú", "u");
        String p1Inverss ="";

        for (int i = p1.length() - 1; i >= 0; i--) {
            p1Inverss += p1.charAt(i);

        }
        if (p1.equals(p1Inverss)){
            System.out.println("Son palindormos");
        }else {
            System.out.println("No so palindomos");
    }


}
     public static void ejer14v2(){
         System.out.println("Introduce un palabra:");
         String p1 = teclado.next();
         //no se tienen en cuenta las mayusculas
         p1.toLowerCase().replaceAll("á", "a")
                 .replaceAll("é", "e")
                 .replaceAll("í", "i")
                 .replaceAll("ó", "o")
                 .replaceAll("ú", "u")
                 .replaceAll(" ", "");
         String p1Inverss = "";
         boolean palindromo = true;
         for (int i = 0; i <p1.length()/2 ; i--) {
             if (p1.charAt(i) != p1.charAt(p1.length()-1-i)){
                 palindromo = false;
                 break;
             }

         }
         if ( palindromo){
             System.out.println("Tu palabra es palindromo");
         } else {
             System.out.println("Tu palabra no es palindromo");
         }
}
    public static void ejer15(){
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        /*frase.toLowerCase().replaceAll("á", "a")
                .replaceAll("é", "e")
                .replaceAll("í", "i")
                .replaceAll("ó", "o")
                .replaceAll("ú", "u")
                .replaceAll("!", ".");*/
        //numero de letras sin espacios ni puntos
        int numLetrasSinCosas= frase.toLowerCase().replaceAll(" ","")
                                  .replaceAll(".","").length();
        //numero oraciones
        int numOraciones = 0;
        int numeroPalabras = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)== '.'){
                numOraciones++;
            } else if (frase.charAt(i)== ' ') {
                numeroPalabras++;
            }
        }
        System.out.printf("Numero frases "+ numOraciones);
        System.out.printf("Numero palabras "+ numeroPalabras);
        System.out.printf("NUmero letas "+ frase.length());
        System.out.printf("Numero letras sin cosas "+ numLetrasSinCosas);

    }
    public static void ejer16(){
        //Generar un numero entre 1y30
        int numAleatorio = aleatorio.nextInt(30)+1;
        int numIntentos = 0;
        int numeroIntentosMax = 10;

        for (int i = 0; i < numeroIntentosMax ; i++) {
            System.out.println("Otro intento");
            int numero = teclado.nextInt();
            numIntentos++;

            if (numAleatorio != numero) {

            } else if (numAleatorio == numero){
                System.out.printf("Has adivinado el numero en %d intentos.", numIntentos);
                break;
            }
            if (numeroIntentosMax == numIntentos){
                System.out.printf("lo siento, agotaste el numero de intentos, el numero era %d.",numAleatorio );
            }
        }

    }
    public static void ejer17(){
        System.out.println("Dime que numero quieres calcular el factorial; ");
        int num = teclado.nextInt();
        int factorial = 1;
        if (num<1){
            System.out.printf("No puedo calcular el factorial.");
        } else {
            for (int i = 1; i <=num ; i++) {
                factorial = factorial*i;
            }
            System.out.printf("El factorial del numero %d es %d ", num, factorial);
        }
    }
}
