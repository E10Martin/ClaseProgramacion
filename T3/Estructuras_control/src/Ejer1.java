import java.util.Scanner;

public class Ejer1 {
    static Scanner teclado = new  Scanner(System.in);

    public static void main(String[] args) {
       //ejer1();
    }
    public static void ejer1(){
        //Pedir por teclado un entero y guardarlo en una variable llamada a.
        // Comprobar si “a” es par. De serlo, se almacena en la cadena “s” el texto “Es par”. Al final del bloque mostrar el mensaje por pantalla
        System.out.println("Introduce un numero entero");
        int n1 = teclado.nextInt();
        String s = "impar";
        if (n1%2 == 0){
            s =("Es par");
        }
        System.out.println(s);
    }

    public static void ejer2(){
        //Pedir por teclado un entero y guardarlo en una variable llamada a. Comprobar si “a” es par o menor que 10 o menor que 100.
        // De ser par, se incrementa en una unidad “a”; de no ser par, si es menor que 10, se decrementa “a” en una unidad; de no
        // ser par, ni ser menor que 10, si es menor que 100, se duplica el valor de “a” y se incrementa en una unidad; de no ser par,
        // ni menor que 10, ni menor que 100, entonces se le asigna a “a” el valor de 0. Al final del bloque mostrar el valor de la por pantalla
        System.out.println("Introduce un numero entero");
        int a = teclado.nextInt();
        String s = "impar";
        if (a%2 == 0){

        } else if (a%2!=0){
            a++;
        } else if (a<10){
            //Es impar --> no es necesario preuntarlo
            a--;
        } else if (a<100){
            //Es impar --> no es necesario preuntarlo
            a*=2;
            a++;
        } else {
            //Es impar --> no es necesario preuntarlo
            a=0;
        }
        System.out.println("El valor de a es "+a);
    }
    public static void ejer3(){
        int a = teclado.nextInt();
        if (a<0){
            System.out.println("Negativo");
        } else if (a<10){
            System.out.println();
        }else if (10<100){
            System.out.println();
        }else if (a<1000){
            System.out.println();
        }
        
    }

}
