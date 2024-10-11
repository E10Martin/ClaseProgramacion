import java.util.Scanner;

public class EstructuraFor {
    static Scanner teclado  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Numero :");
        int n1 = teclado.nextInt();
        for (int i=0; i<11; i++){
            System.out.printf("%d * %d = %d\n", n1, i, n1*i);
        }
    }
}
