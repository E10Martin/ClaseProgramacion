import java.util.Scanner;

public class EjerSwitch {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //ejer1();
        ejer2();
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
                System.out.println("Vocal");
                break;
            case 'e' ,'E':
                System.out.println("Vocal");
                break;
            case 'i' ,'I':
                System.out.println("Vocal");
                break;
            case 'o' ,'O':
                System.out.println("Vocal");
                break;
            case 'u' ,'U':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Es consonante");

        }

    }
}
