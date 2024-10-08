import java.util.Scanner;

public class EjerSwitch {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //ejer1();
        //ejer2();
        ejer3();
        //ejer4();
    }
    public static void ejer1(){
        //Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y
        // muestre el día de la semana correspondiente utilizando una sentencia switch.
        System.out.println("Introduce un numero del 1 al 7;");
        int num = teclado.nextInt();
        switch (num){
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
    public static void ejer2(){
        //Crea un programa que permita al usuario ingresar un carácter y
        // luego determine si es una vocal o una consonante utilizando una sentencia switch.
        System.out.println("Introduce un caracter");
        char palabra = teclado.next().charAt(0);
        switch (palabra) {
            case 'a' ,'A':
            case 'e' ,'E':
            case 'i' ,'I':
            case 'o' ,'O':
            case 'u' ,'U':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Es consonante");

        }

    }
    public static void ejer3(){
        //Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.
        System.out.println("Dame un numero entero;");
        int n1 = teclado.nextInt();
        int n2 = n1%2;
        switch (n2){
            case 0:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
        }
    }
    public static void ejer4(){
        //Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12)
        // y muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.
        System.out.println("Ingresa un mes(con un numero del 1 al 12);");
        String mes = teclado.next();
        switch (mes.toLowerCase()){
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

}
