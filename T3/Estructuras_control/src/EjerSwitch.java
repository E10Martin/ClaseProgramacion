import java.util.Scanner;

public class EjerSwitch {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //ejer1();
        //ejer2();
        //ejer3();
        //ejer4();
        //ejer5();
        //ejer6();
        //ejer7();
        //ejer8();
        //ejer9();
        ejer10();
    }

    public static void ejer1() {
        //Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y
        // muestre el día de la semana correspondiente utilizando una sentencia switch.
        System.out.println("Introduce un numero del 1 al 7;");
        int num = teclado.nextInt();
        switch (num) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No me vaciles retra.");
        }
    }

    public static void ejer2() {
        //Crea un programa que permita al usuario ingresar un carácter y
        // luego determine si es una vocal o una consonante utilizando una sentencia switch.
        System.out.println("Introduce un caracter");
        char palabra = teclado.next().charAt(0);
        switch (palabra) {
            case 'a', 'A':
            case 'e', 'E':
            case 'i', 'I':
            case 'o', 'O':
            case 'u', 'U':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Es consonante");

        }

    }

    public static void ejer3() {
        //Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.
        System.out.println("Dame un numero entero;");
        int n1 = teclado.nextInt();
        int n2 = n1 % 2;
        switch (n2) {
            case 0:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
        }
    }

    public static void ejer4() {
        //Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12)
        // y muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.
        System.out.println("Ingresa un mes(con un numero del 1 al 12);");
        String mes = teclado.next();
        switch (mes.toLowerCase()) {
            case "marzo":
            case "abril":
            case "mayo":
            case "junio":
            case "enero":
            case "julio":
            case "agosto":
            case "septiembre":
            case "octubre":
            case "nomviembre":
            case "diciembre":
                System.out.println("Tienes 30 dias");
                break;
            case "febrero":
                System.out.println("Febrero 29 dias");
                break;
            default:
                System.out.println("Se serio anda");
        }
    }

    public static void ejer5() {
        System.out.println("Introduce un numero del 1 al 12");
        int n1 = teclado.nextInt();
        switch (n1) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Tete del 1 al 12 te he dicho retrasao.");
        }
    }

    public static void ejer6() {
        System.out.println("Introduce una opcion(1 al 4):");
        int n = teclado.nextInt();

        switch (n) {
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
            case 3:
                System.out.println("Opcion 3");
                break;
            case 4:
                System.out.println("Opcion 4");
                break;
            default:
                System.out.println("He dicho del 1 al 4 retra.");
        }
    }

    public static void ejer7() {
        System.out.println("Introduce un numero del 1 al 5");
        int n1 = teclado.nextInt();
        switch (n1) {
            case 0, 1, 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Aprobao");
                break;
            case 4:
                System.out.println("NOtable");
                break;
            case 5:
                System.out.println("Soobresaliente");
                break;
            default:
                System.out.println("Del 1 al 5 aunqu seguro que has sacado un 0.");


        }

    }

    public static void ejer8() {
        System.out.println("Introduce un numero");
        int n2 = teclado.nextInt();
        System.out.println("Introduce un numero");
        int n3 = teclado.nextInt();
        System.out.println("Introduce un caracter (+, -, *, /)");
        char caracter = teclado.next().charAt(0);

        switch (caracter) {
            case '+':
                int total = n3 + n2;
                System.out.printf("La suma de: %d + %d = %d", n2, n3, total);
                break;
            case '-':
                int total1 = n3 - n2;
                System.out.printf("La suma de: %d - %d = %d", n2, n3, total1);
                break;
            case '*':
                int total2 = n3 * n2;
                System.out.printf("La multiplicacion de: %d * %d = %d", n2, n3, total2);
                break;
            case '/':
                int total3 = n3 / n2;
                System.out.printf("La division de: %d / %d = %d", n2, n3, total3);
                break;
            default:
                System.out.println("Non caracter foound\n" + "Ponlo bien goofy");


        }
    }

    public static void ejer9() {
        System.out.println("Introduce un numero(1 al 12):");
        int n1 = teclado.nextInt();
        switch (n1) {
            case 1, 2, 3:
                System.out.println("Invierno");
                break;
            case 4, 5, 6:
                System.out.println("Primavera");
                break;
            case 7, 8, 9:
                System.out.println("Verano");
                break;
            case 10, 11, 12:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Ponlo bien");

        }
    }

    public static void ejer10(){
        System.out.println("Introduce un codigo de producto: ");
        String caracteres = teclado.next();

        switch (caracteres){
            //Producto 1
            case "#ep002":
                System.out.println("Producto 1");
                break;
            default:
                System.out.println("No encuentro el producto");

        }
    }


}
