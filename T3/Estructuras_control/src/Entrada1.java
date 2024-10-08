import java.util.Scanner;

public class Entrada1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10 anda; ");
        int num = teclado.nextInt();
        switch (num){
            case 0:
                System.out.println("EL valor es 0");
            case 5:
                System.out.println("El valor es 5");
            case 10:
                System.out.println("El valor es 10");
            default:
                System.out.println("No hay mas valores retra");
        }
        char letra = 'Z';
        switch (letra){
            case 'Z':
                System.out.println("Coindice tt");
        }
    }
}
